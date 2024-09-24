package com.example.spring_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello() {

        return "Paravathi matha amma kapadu amma!";

    }

    @GetMapping("/hello2")
    public String sayHello2() {

        return "Hello World hellow ";

    }

    @GetMapping("/hello3")
    public String sayHello3() {

        return "Hello World  Oam Jai parvathi amma namaha   ";
      // System.out.println("Hello World");

    }
}
