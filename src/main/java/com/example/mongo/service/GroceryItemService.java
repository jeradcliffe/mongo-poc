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

    ///////////////////////////////
    // CREATE
    ///////////////////////////////
    public void createGroceryItems() {
        System.out.println("Data creation started...");
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
        System.out.println("Data creation complete...");
    }

    ///////////////////////////////
    // READ
    ///////////////////////////////
    public List<GroceryItem> showAllGroceryItems() {
        return repository.findAll();
    }

    public void getGroceryItemByName(String name) {
        System.out.println("getGroceryItemByName: " + name);
        GroceryItem item = repository.findItemByName(name);
        System.out.println(item);
    }

    public void getItemsByCategory(String category) {
        System.out.println("getItemsByCategory: " + category);
        List<GroceryItem> list = repository.findAll(category);
        list.forEach(System.out::println);
    }

    public void findCountOfGroceryItems() {
        System.out.println("findCountOfGrocerItems: " + repository.count());
    }

    ///////////////////////////////
    // UPDATE
    ///////////////////////////////
    public void updateCategoryName(String category) {
        String newCategory = "munchies";
        List<GroceryItem> list = repository.findAll(category);
        list.forEach(item -> item.setCategory(newCategory));
        List<GroceryItem> itemsUpdated = repository.saveAll(list);
        System.out.println("Successfully updated " + itemsUpdated.size() + " items.");
    }

    ///////////////////////////////
    // DELETE
    ///////////////////////////////
    public void deleteGroceryItem(String id) {
        repository.deleteById(id);
        System.out.println("Item with id " + id + " deleted...");
    }
}
