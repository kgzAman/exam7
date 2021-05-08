package com.aman.exam7.controllers;

import com.aman.exam7.dto.DishDto;
import com.aman.exam7.entity.Dish;
import com.aman.exam7.repositories.DishRepositories;
import com.aman.exam7.services.DishService;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.Optional;

@RestController
@RequestMapping("api/dishes")
@Data
public class DishController {

    private static  final ModelMapper modelMapper = new ModelMapper();

    private final DishRepositories dishRepositories;
    private final DishService dishService;

    @GetMapping("/placesFrom")
    public Optional<Dish> getAllDishByRestaurant(@PathVariable String restaurantId, Pageable pageable){
        return  this.dishService.getAllDishByRestaurant(restaurantId,pageable);

    }

}
