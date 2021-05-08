package com.aman.exam7.repositories;

import com.aman.exam7.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order,String> {

    List<Order> findAllById(String userId);
}
