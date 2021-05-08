package com.aman.exam7.repositories;

import com.aman.exam7.entity.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestaurantRepositories extends MongoRepository<Restaurant, String> {



}
