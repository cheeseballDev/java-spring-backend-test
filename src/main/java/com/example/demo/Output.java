package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Output {
    @RequestMapping("/")
    public String printOutput() {
        return "FOR THE CONCERT!";
    }
}
