package com.aman.exam7.controllers;

import com.aman.exam7.entity.Restaurant;
import com.aman.exam7.repositories.RestaurantRepositories;
import com.aman.exam7.services.RestourantService;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/restaurant")
@Data
public class RestaurantControllers {

    private static  final ModelMapper modelMapper = new ModelMapper();

    private final RestaurantRepositories restaurantRepositories;
    private final RestourantService restourantService;

    public RestaurantControllers(RestaurantRepositories restaurantRepositories, RestourantService restourantService) {
        this.restaurantRepositories = restaurantRepositories;
        this.restourantService = restourantService;
    }

    @GetMapping()
    public Page<Restaurant> getAllRestaurant(){
        return new PageImpl<Restaurant>(this.restaurantRepositories.findAll());
    }



}
