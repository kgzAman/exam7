package com.aman.exam7.controllers;

import com.aman.exam7.dto.DishDto;
import com.aman.exam7.repositories.DishRepositories;
import com.aman.exam7.services.DishService;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/dishes")
@Data
public class DishController {

    private static  final ModelMapper modelMapper = new ModelMapper();

    private final DishRepositories dishRepositories;
    private final DishService dishService;

    @GetMapping()
    public Optional<DishDto> getAllDishByRestaurant(@PathVariable String restaurantId,@ApiIgnore Pageable pageable){
        return  this.dishService.getAllDishByRestaurant(restaurantId, pageable );

    }

}
