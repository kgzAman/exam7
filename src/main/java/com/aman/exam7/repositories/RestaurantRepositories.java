package com.aman.exam7.repositories;

import com.aman.exam7.entity.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RestaurantRepositories extends MongoRepository<Restaurant, String> {

    List<Restaurant>findByNameRestaurant(String name);

}
