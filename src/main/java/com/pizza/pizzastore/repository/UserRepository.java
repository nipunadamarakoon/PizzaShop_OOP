package com.pizza.pizzastore.repository;

import com.pizza.pizzastore.model.User;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User,String> {
    public User getByUid(String uid);
}
