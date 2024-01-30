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

    /**
     * @param category to filter on
     * @return we want all the items in this category
     * We only want to project the `name` and `quantity` on the returned items
     * https://www.mongodb.com/docs/manual/tutorial/project-fields-from-query-results/?_ga=2.18936689.813680234.1706590555-2006937484.1694798499
     */
    @Query(
            value = "{category:'?0'}",
            fields = "{'name':  1, 'quantity':  1}"
    )
    List<GroceryItem> findAll(String category);

    /**
     * @return count of all grocery items
     */
    long count();
}
