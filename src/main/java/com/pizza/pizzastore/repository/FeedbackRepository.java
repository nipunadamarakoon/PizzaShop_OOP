package com.pizza.pizzastore.repository;

import com.pizza.pizzastore.model.Feedback;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepository extends CrudRepository<Feedback,String> {
    public Feedback getByFid(String fid);
}
