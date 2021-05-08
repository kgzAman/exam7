package com.aman.exam7.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
//@Document(collection = "dish")
public class Dish {

    @Id
    private String id;

    @DBRef
    private Restaurant restaurant;

    private String name;
    private Type type;
    private double price;

}
