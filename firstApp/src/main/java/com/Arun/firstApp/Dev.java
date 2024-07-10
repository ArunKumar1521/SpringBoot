package com.Arun.firstApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    private laptop laptop;
    public void build(){
        laptop.compile();
        System.out.println("working on a project");
    }
}
