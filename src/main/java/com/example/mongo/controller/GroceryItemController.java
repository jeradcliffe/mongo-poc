package com.example.mongo.controller;

import com.example.mongo.document.GroceryItem;
import com.example.mongo.model.GroceryUpdateRequest;
import com.example.mongo.service.GroceryItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @RestController: made up of @Controller and @ResponseBody
 * @Controller: This is simply a specialization of the @Component class, which allows us to auto-detect implementation
 * classes through the classpath scanning (layman's terms: let spring know this thing should run when app runs)
 * @ResponseBody: This annotation enables automatic serialization of the return object into the HttpResponse.
 */
@RestController
@RequestMapping("/groceries")
@RequiredArgsConstructor
public class GroceryItemController {

    private final GroceryItemService service;

    @GetMapping("/")
    public List<GroceryItem> getGroceryItems() {
        return service.showAllGroceryItems();
    }

    // Note that items will come back with a category of null due to Repository overrides.
    @GetMapping("/{category}")
    public List<GroceryItem> getGroceryItemsByCategory(@PathVariable("category") String category) {
        return service.getItemsByCategory(category);
    }

    @GetMapping("/count")
    public long getGroceryCount() {
        return service.getGroceryCount();
    }

    @PostMapping("/create")
    public HttpStatus createGroceryItems() {
        service.createGroceryItems();
        return HttpStatus.CREATED;
    }

    @PutMapping("/update")
    public List<GroceryItem> updateCategoryName(@RequestBody GroceryUpdateRequest request) {
        return service.updateCategoryName(request.oldCategory, request.newCategory);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll() {
        return String.format("Deleted %s items", service.deleteAll());
    }
}
