package com.aman.exam7.services;

import com.aman.exam7.entity.Restaurant;
import com.aman.exam7.repositories.RestaurantRepositories;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
@NoArgsConstructor
@Data
public class RestourantService {


    private RestaurantRepositories restaurantRepositories;

    public List<Restaurant> getAllRestaurant(Pageable pageable){return restaurantRepositories.findAll(); }


    public List<Restaurant> getRestaurantByName(String name){
        return this.restaurantRepositories.findByNameRestaurant(name);
    }
}
