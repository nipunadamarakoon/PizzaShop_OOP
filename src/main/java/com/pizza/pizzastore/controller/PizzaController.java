package com.pizza.pizzastore.controller;

import com.pizza.pizzastore.model.Pizza;
import com.pizza.pizzastore.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(path = "/pizza")
public class PizzaController {
    @Autowired
    private PizzaRepository pizzaRepository;

    @PostMapping(path = "/add")
    public Pizza addNewPizza(@RequestBody Pizza newPizza) {
        return pizzaRepository.save(newPizza);
    }
}
