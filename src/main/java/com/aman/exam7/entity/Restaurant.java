package com.aman.exam7.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Builder
@Data
public class Restaurant {

    @Id
    private String id;

    private String nameRestaurant;
    private String description;
}
