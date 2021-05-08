package com.aman.exam7.repositories;

import com.aman.exam7.dto.DishDto;
import com.aman.exam7.entity.Dish;
import com.aman.exam7.entity.Restaurant;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.awt.print.Pageable;
import java.util.Optional;

public interface DishRepositories extends MongoRepository<Dish,String> {

    Optional<DishDto> findByRestaurant(String id);
    Optional<DishDto>findByRestaurant(String resId,Pageable pageable);

}
