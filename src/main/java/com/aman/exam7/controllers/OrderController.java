package com.aman.exam7.controllers;

import com.aman.exam7.dto.OrderDto;
import com.aman.exam7.entity.Order;
import com.aman.exam7.entity.User;
import com.aman.exam7.repositories.OrderRepository;
import com.aman.exam7.services.OrderService;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
@Data
public class OrderController {

    private OrderRepository orderRepositories;
    private OrderService orderService;

    @PostMapping("/order")
    public String order( @RequestBody OrderDto orderDto, String resName,Authentication authentication){
        User user = (User)authentication.getPrincipal();
        Order order =Order.builder()
                .orderedUser(user)
                .orderedDish(orderDto.getOrderedDish())
                .localDateTime(orderDto.getLocalDateTime())
                .build();
        return this.orderService.makeOrder(order).getId();
    }

    @GetMapping("/UserOrders")
    public Page<Order> allOrder(String userId, Pageable pageable){

        return this.orderService.findByOrderedUser(userId,pageable);
    }
}
