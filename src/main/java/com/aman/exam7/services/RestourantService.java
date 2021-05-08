package com.aman.exam7.services;

import com.aman.exam7.entity.Restaurant;
import com.aman.exam7.repositories.RestaurantRepositories;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@Data
public class RestourantService {


    private RestaurantRepositories institutionRepositories;

    public List<Restaurant> getAllInstitution(Pageable pageable){return institutionRepositories.findAll(); }
}
