package com.aman.exam7.repositories;

import com.aman.exam7.entity.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RestaurantRepositories extends MongoRepository<Restaurant, String> {

    Optional<Restaurant>findById(String id);


}
