package com.example.mongo.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("groceryitems")
@AllArgsConstructor
@NoArgsConstructor
@Data // Getters, setters, equals hash, to string that is useful
@Builder // Only build with what you need
public class GroceryItem {

    @Id // Allows us to use `id` instead of `_id`
    private String id;
    private String name;
    private int quantity;
    private String category;
}