package com.day1_ph.day1_ph.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pah{
   @GetMapping ("/hello")
   public String welcome(){
        return "Hello World!";
   }
}