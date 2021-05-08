package com.aman.exam7.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Builder
@Data
public class Dish {

    @Id
    private String id;

    private String name;
    private Type type;
    private double price;

}
