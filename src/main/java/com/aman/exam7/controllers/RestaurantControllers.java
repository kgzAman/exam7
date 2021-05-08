package com.aman.exam7.controllers;

import com.aman.exam7.dto.RestaurantDto;
import com.aman.exam7.repositories.RestaurantRepositories;
import com.aman.exam7.services.RestourantService;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/institutions")
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
    public List<RestaurantDto> getAllRestaurant(Pageable pageable){
       return  this.restourantService.getAllRestaurant(pageable)
               .stream().map(restaurant -> modelMapper.map(restaurant, RestaurantDto.class))
               .collect(Collectors.toList());
    }



}
