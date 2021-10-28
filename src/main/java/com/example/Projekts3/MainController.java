package com.example.Projekts3;

import com.example.Projekts3.Klienti.Klienti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller

public class MainController {
    @Autowired private MainService service;



    @GetMapping("/klienti")
    public String showUserList(Model model) {
        List<Klienti> listKlienti = (List<Klienti>) service.listAll();
        model.addAttribute("listKlienti", listKlienti);
        return "klienti";
    }
    @GetMapping("/users/new")
    public String showNewForm(Model model) {
        model.addAttribute("klienti", new Klienti());
        return "klienti_form";
    }
}
