package com.example.onlineshop.repos;

import com.example.onlineshop.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepo extends JpaRepository<Cart, Integer> {

    public List<Cart> findAllByUserId(Long userId);
}
