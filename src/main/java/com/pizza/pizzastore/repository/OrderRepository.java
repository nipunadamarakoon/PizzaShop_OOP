package com.pizza.pizzastore.repository;

import com.pizza.pizzastore.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, String> {
    public Order getByOid(String oid);
}
