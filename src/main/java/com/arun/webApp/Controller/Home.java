package com.arun.webApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Home {
    @RequestMapping("/")
    public String greet(){
        return "Welcome to myApp";
    }

    @RequestMapping("/about")
    public String about(){
        return "a simple spring web application";
    }
}
