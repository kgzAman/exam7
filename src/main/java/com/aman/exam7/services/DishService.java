package com.aman.exam7.services;


import com.aman.exam7.entity.Dish;
import com.aman.exam7.entity.Restaurant;
import com.aman.exam7.repositories.DishRepositories;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
@NoArgsConstructor
@Data
public class DishService {

    private DishRepositories dishRepositories;
    private RestourantService restourantService;


    public DishService(DishRepositories dishRepositories) {
        this.dishRepositories = dishRepositories;
    }

    public List<Dish> getAllDishByRestaurant(Pageable pageable){
        final List<Restaurant> restaurantsByName = this.restourantService.getAllRestaurant(pageable);
        return this.dishRepositories.findByRestaurant(restaurantsByName);
    }



}
