package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsHello {
    
    @GetMapping("/news")
    public String newsHelloString(){
        return "Heyooo World";
    }

    
}