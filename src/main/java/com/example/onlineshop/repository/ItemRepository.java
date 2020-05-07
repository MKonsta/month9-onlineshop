package com.example.onlineshop.repository;

import com.example.onlineshop.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    Item findByName(String name);
}
