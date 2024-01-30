package com.example.mongo.controller;

import com.example.mongo.document.GroceryItem;
import com.example.mongo.service.GroceryItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GroceryItemController {

    private final GroceryItemService service;

    @GetMapping("/groceries")
    public List<GroceryItem> getGroceryItems() {
        return service.showAllGroceryItems();
    }
}
