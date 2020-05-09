package com.pizza.pizzastore.controller;

import com.pizza.pizzastore.model.Pizza;
import com.pizza.pizzastore.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RestController
@RequestMapping(path = "/pizza")
public class PizzaController {
    @Autowired
    private PizzaRepository pizzaRepository;

    @PostMapping(path = "/save")
    public Pizza addNewPizza(@RequestBody Pizza newPizza) {
        return pizzaRepository.save(newPizza);
    }
    @GetMapping(path = "/get/{id}")
    public Pizza getPizza(@PathVariable String id) {
        return pizzaRepository.getByPid(id);
    }

    @GetMapping(path = "/get-all")
    public Iterable<Pizza> getAllPizza() {
        return pizzaRepository.findAll();
    }
//    @DeleteMapping(path = "/delete/{id}")
//    public ResponseBody deletePizza(@PathVariable String id) {
//         pizzaRepository.deleteById(id);
//         return st
//    }

}
