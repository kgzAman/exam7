package com.aman.exam7.dto;

import com.aman.exam7.entity.Restaurant;
import com.aman.exam7.entity.Type;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class DishDto {

    @DBRef
    private Restaurant restaurant;

    private String name;
    private Type type;
    private double price;
}
