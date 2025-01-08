package com.rideeasy.rideeasy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks the class as a REST Controller
@RequestMapping("/")  // Prefix to all the routes in this controller
public class HelloController {

    // Map the root URL (GET request to "/")
    @GetMapping("/message")
    public String helloMan() {
        return "Hello, man!";
    }

    // Map the "/hello" URL (GET request to "/hello")
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, welcome to Rideeasy!";
    }

    
    // Another example with a dynamic path variable (GET request to "/greet/{name}")
    @GetMapping("/greet/{name}")
    public String greetUser(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
