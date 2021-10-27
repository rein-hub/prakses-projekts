package com.example.Projekts3;

import com.example.Projekts3.Klienti.Klienti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
    @Autowired
    MainService service;

    @GetMapping("/save")
    public Klienti save() {
        return service.save();
    }

    @GetMapping("/get")
    public Klienti getKlienti() {
        return service.getKlienti();
    }
}