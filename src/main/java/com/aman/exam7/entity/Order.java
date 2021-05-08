package com.aman.exam7.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;

@Builder
@Data
public class Order {
    @Id
    private String id;

    @DBRef
    private User orderedUser;

    @DBRef
    private Dish orderedDish;

    private LocalDateTime localDateTime;
}
