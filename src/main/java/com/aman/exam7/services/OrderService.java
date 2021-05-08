package com.aman.exam7.services;

import com.aman.exam7.entity.Order;
import com.aman.exam7.entity.User;
import com.aman.exam7.repositories.OrderRepository;
import com.aman.exam7.repositories.UserRepositories;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
@Data
public class OrderService {

    private OrderRepository orderRepository;
    private UserRepositories userRepositories;

    public Order makeOrder(Order order){
        return this.orderRepository.save(order);
    }

    public List<Order> findByOrderedUser(String userId){
          return this.orderRepository.findAllById(userId);
    }


}
