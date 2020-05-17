package com.example.onlineshop.repos;

import com.example.onlineshop.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepo extends JpaRepository<Item, Long> {

    List<Item> findByNameContains(String name);

    List<Item> findByCategoryContains(String name);

    List<Item> findByPriceBefore(int lowerPrice);

    List<Item> findByPriceAfter(int morePrice);
}
