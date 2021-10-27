package com.example.Projekts3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {


    @GetMapping("")
    public String showHomePage() {
        System.out.println("Main");
        return "index";
    }112
}
