package com.aman.exam7.services;

import com.aman.exam7.entity.Order;
import com.aman.exam7.repositories.OrderRepository;
import com.aman.exam7.repositories.UserRepositories;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@Data
public class OrderService {

    private OrderRepository orderRepository;
    private UserRepositories userRepositories;

    public Order makeOrder(Order order){
        return this.orderRepository.save(order);
    }

    public Page<Order> findByOrderedUser(String userId, Pageable pageable){
          return this.orderRepository.findAllById(userId,pageable);
    }


}
