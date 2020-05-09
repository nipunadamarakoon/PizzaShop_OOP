package com.pizza.pizzastore.controller;

import com.pizza.pizzastore.model.Feedback;
import com.pizza.pizzastore.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/feedback")
public class FeedbackController {
    @Autowired
    private FeedbackRepository feedbackRepository;
    @PostMapping(path = "/add")
    public Feedback addNewFeedback(@RequestBody Feedback newFeedback){
        return feedbackRepository.save(newFeedback);
    }
    @GetMapping(path = "/get/{id}")
    public Feedback getFeedback(@PathVariable String id){
        return feedbackRepository.getByFid(id);
    }
    @GetMapping(path = "/get-all")
    public Iterable<Feedback> getAllFeedback(){
        return feedbackRepository.findAll();
    }
}
