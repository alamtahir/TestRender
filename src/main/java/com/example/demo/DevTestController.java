package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class DevTestController {

    @GetMapping("/home")
    public  String getHome(){
        return "Home Page";
    }

    public  String getAbout(){
        return "About Page";
    }
}
