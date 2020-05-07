package com.example.onlineshop.controller;

import com.example.onlineshop.dto.FindDto;
import com.example.onlineshop.model.Item;
import com.example.onlineshop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/registration")
    public String regist() {
        return "registration";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/")
    public String allItems(Model model) {
        model.addAttribute("items", itemRepository.findAll());
        return "index";
    }

    @PostMapping("/findItem")
    public String findItems(FindDto findDto, Model model) {
        List<Item> items = new ArrayList<>();
        if (findDto.getType().equals("byName")) {
            for (Item item : itemRepository.findAll()) {
                if (item.getName().contains(findDto.getVal())) {
                    items.add(item);
                }
            }
        } else if (findDto.getType().equals("price")) {
            int price = Integer.parseInt(findDto.getVal());
            for (Item item : itemRepository.findAll()) {
                if (item.getPrice() < price) {
                    items.add(item);
                }
            }
        }
        model.addAttribute("items", items);
        return "index";
    }
}
