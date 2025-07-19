package com.springdemo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String HelloWorld() {
        return "Hello World from Spring Boot!";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "Bienvenue à Spring Boot!";
    }
}
