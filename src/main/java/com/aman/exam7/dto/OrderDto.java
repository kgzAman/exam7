package com.aman.exam7.dto;

import com.aman.exam7.entity.Dish;
import com.aman.exam7.entity.User;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;
@Data
public class OrderDto {
    @DBRef
    private User orderedUser;

    @DBRef
    private Dish orderedDish;


    private LocalDateTime localDateTime;
}
