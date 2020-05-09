package com.pizza.pizzastore.repository;

import com.pizza.pizzastore.model.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepository extends CrudRepository<Pizza, String> {
    public Pizza getByPid(String pid);

}
