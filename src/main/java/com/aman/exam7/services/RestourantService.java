package com.aman.exam7.services;

import com.aman.exam7.entity.Restaurant;
import com.aman.exam7.repositories.RestaurantRepositories;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

;

@Service
@NoArgsConstructor
@Data
public class RestourantService {


    private RestaurantRepositories restaurantRepositories;

    public Optional<Restaurant> getAllRestaurant(String resId){

       return restaurantRepositories.findById(resId);

    }

}
