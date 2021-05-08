package com.aman.exam7.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Builder
@Data
public class Dish {

    @Id
    private String id;

    @DBRef
    private Restaurant restaurant;

    private String name;
    private Type type;
    private double price;

}
