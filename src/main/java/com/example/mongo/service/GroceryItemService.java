package com.example.mongo.service;

import com.example.mongo.document.GroceryItem;
import com.example.mongo.repository.GroceryItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // All args constructor that demands dependencies to be declared as final
public class GroceryItemService {

    private final GroceryItemRepository repository;

    public void createGroceryItems() {
        repository.save(GroceryItem.builder()
                .id("Whole Wheat Biscuit")
                .name("Whole Wheat Biscuit")
                .quantity(5)
                .category("snacks")
                .build());
        repository.save(GroceryItem
                .builder()
                .id("Kodo Millet")
                .name("XYZ Kodo Millet healthy")
                .quantity(2)
                .category("millets")
                .build());
        repository.save(GroceryItem
                .builder()
                .id("Dried Red Chilli")
                .name("Dried Whole Red Chilli")
                .quantity(2)
                .category("spices")
                .build());
        repository.save(GroceryItem
                .builder()
                .id("Pearl Millet")
                .name("Healthy Pearl Millet")
                .quantity(1)
                .category("millets")
                .build());
        repository.save(GroceryItem
                .builder()
                .id("Cheese Crackers")
                .name("Bonny Cheese Crackers Plain")
                .quantity(6)
                .category("snacks")
                .build());
    }

    public List<GroceryItem> showAllGroceryItems() {
        return repository.findAll();
    }

    public List<GroceryItem> getItemsByCategory(String category) {
        return repository.findAll(category);
    }

    public long getGroceryCount() {
        return repository.count();
    }

    public List<GroceryItem> updateCategoryName(String originalCategory, String newCategory) {
        List<GroceryItem> list = repository.findAll(originalCategory);
        list.forEach(item -> item.setCategory(newCategory));
        return repository.saveAll(list);
    }

    public long deleteAll() {
        long itemCount = repository.count();
        repository.deleteAll();
        return itemCount;
    }
}
