package com.example.mongo;

import com.example.mongo.service.GroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("-----CREATE GROCERY ITEMS-----\n");
//        service.createGroceryItems();
//
//        System.out.println("\n-----SHOW ALL GROCERY ITEMS-----\n");
//        service.showAllGroceryItems();
//
//        System.out.println("\n-----GET ITEM BY NAME-----\n");
//        service.getGroceryItemByName("Whole Wheat Biscuit");
//
//        System.out.println("\n-----GET ITEMS BY CATEGORY-----\n");
//        service.getItemsByCategory("millets");
//
//        System.out.println("\n-----UPDATE CATEGORY NAME OF SNACKS CATEGORY-----\n");
//        service.updateCategoryName("snacks");
//
//        System.out.println("\n-----DELETE A GROCERY ITEM-----\n");
//        service.deleteGroceryItem("Kodo Millet");
//
//        System.out.println("\n-----FINAL COUNT OF GROCERY ITEMS-----\n");
//        service.findCountOfGroceryItems();
//
//        System.out.println("\n-----THANK YOU-----");
//    }
}
