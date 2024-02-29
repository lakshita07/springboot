package com.day2_ex2.day2_ex2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.day2_ex2.day2_ex2.model.PostMan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PostManController {
    @PostMapping("/post")
    public PostMan postMethodName(@RequestBody PostMan entity) {
      
        return entity;
    }
    
}