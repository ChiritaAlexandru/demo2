package com.example.demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @Value("${age}")
    String name;

    @GetMapping("/")
    public String m1(){
        System.out.println("");
        return "hello";
    }

    @GetMapping("/name")
    public String m2(){
        return "Hello "+ name;
    }

}
