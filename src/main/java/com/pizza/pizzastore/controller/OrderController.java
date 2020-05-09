package com.pizza.pizzastore.controller;

import com.pizza.pizzastore.model.Order;
import com.pizza.pizzastore.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping(path = "/order")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;
    @PostMapping(path = "/add")
    public Order addNewOrder(@RequestBody Order newOrder){
        return orderRepository.save(newOrder);
    }
    @GetMapping(path = "/get/{id}")
    public Order getOrder(@PathVariable String id){
        return orderRepository.getByOrderId(id);
    }
    @GetMapping(path = "/get-all")
    public Iterable<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
