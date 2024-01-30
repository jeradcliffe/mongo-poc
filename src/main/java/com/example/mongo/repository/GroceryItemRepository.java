package com.example.mongo.repository;

import com.example.mongo.document.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Repository layer is responsible for your communication with your specific model and the DB
 * MongoRepository<Model Type, Id String Type>
 * Basic queries will be autocompleted for you (and auto implemented!)
 */
public interface GroceryItemRepository extends MongoRepository<GroceryItem, String> {

    @Query("{name: '?0'}")
    GroceryItem findItemByName(String name);

    @Query(
            value = "{category:'?0'}",
            fields = "{'name':  1, 'quantity':  1}"
    )
    List<GroceryItem> findAll(String category);

    long count();
}
