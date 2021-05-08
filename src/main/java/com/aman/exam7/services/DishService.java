package com.aman.exam7.services;


import com.aman.exam7.dto.DishDto;
import com.aman.exam7.entity.Dish;
import com.aman.exam7.repositories.DishRepositories;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
@Data
public class DishService {

    private DishRepositories dishRepositories;
    private RestourantService restourantService;


    public DishService(DishRepositories dishRepositories) {
        this.dishRepositories = dishRepositories;
    }

    public Optional<DishDto> getAllDishByRestaurant(String resId, Pageable pageable){
         return this.dishRepositories.findByRestaurant(resId,pageable);

    }



}
