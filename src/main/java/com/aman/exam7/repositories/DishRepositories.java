package com.aman.exam7.repositories;

import com.aman.exam7.entity.Dish;
import com.aman.exam7.entity.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DishRepositories extends MongoRepository<Dish,String> {

    List<Dish> findByRestaurant(List<Restaurant> restaurant);
}
