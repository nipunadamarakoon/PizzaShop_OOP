package com.pizza.pizzastore.controller;

import com.pizza.pizzastore.model.User;
import com.pizza.pizzastore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping(path = "/register")
    public User addNewUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }
    @GetMapping(path = "/get/{id}")
    public User getUser(@PathVariable String id){
        return userRepository.getByUserId(id);
    }
    @GetMapping(path = "/get-all")
    public Iterable<User> getAllUser(){
        return userRepository.findAll();
    }
}
