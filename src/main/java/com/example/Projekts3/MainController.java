package com.example.Projekts3;

import com.example.Projekts3.Klienti.Klienti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/klienti")
    public String showUserList(Model model) {
        List<Klienti> listKlienti = (List<Klienti>) service.listAll();
        model.addAttribute("listKlienti", listKlienti);
        return "klienti";
    }
}
