package com.example.onlineshop.controller;

import com.example.onlineshop.domain.Cart;
import com.example.onlineshop.domain.Item;
import com.example.onlineshop.domain.User;
import com.example.onlineshop.repos.CartRepo;
import com.example.onlineshop.repos.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private CartRepo cartRepo;

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("/")
    public String greeting(String name, String category, String lowPrice, String morePrice, Model model) {
        Iterable<Item> items;

        if (name != null && !name.isEmpty()) {
            items = itemRepo.findByNameContains(name);
            model.addAttribute("items", items);
            return "index";
        }

        if (category != null && !category.isEmpty()) {
            items = itemRepo.findByCategoryContains(category);
            model.addAttribute("items", items);
            return "index";
        }

        if (lowPrice != null && !lowPrice.isEmpty()) {
            items = itemRepo.findByPriceBefore(Integer.parseInt(lowPrice));
            model.addAttribute("items", items);
            return "index";
        }

        if (morePrice != null && !morePrice.isEmpty()) {
            items = itemRepo.findByPriceAfter(Integer.parseInt(morePrice));
            model.addAttribute("items", items);
            return "index";
        }

        items = itemRepo.findAll();
        model.addAttribute("items", items);
        return "index";
    }

    @PostMapping("/addToCart")
    public String addToCart(@AuthenticationPrincipal User user, String itemId, String itemName) {
        Cart cart = new Cart(user.getId(), Integer.parseInt(itemId), itemName);
        cartRepo.save(cart);
        return "redirect:/";
    }

    @PostMapping("/cart")
    public String cart(@AuthenticationPrincipal User user, Model model) {
        List<Cart> carts = cartRepo.findAllByUserId(user.getId());
        model.addAttribute("carts", carts);
        return "cart";
    }

    @PostMapping("/delete")
    public String delete(String cartId, String userId, Model model) {
        cartRepo.deleteById(Integer.parseInt(cartId));
        List<Cart> carts = cartRepo.findAllByUserId(Long.parseLong(userId));
        model.addAttribute("carts", carts);
        return "cart";
    }



}