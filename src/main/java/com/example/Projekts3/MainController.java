package com.example.Projekts3;

import com.example.Projekts3.Klienti.Klienti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import java.util.List;

@Controller

public class MainController {
    @Autowired
    private MainService service;


    @GetMapping("/klienti")
    public String showUserList(Model model) {
        List<Klienti> listKlienti = (List<Klienti>) service.listAll();
        model.addAttribute("listKlienti", listKlienti);
        return "klienti";
    }

    @GetMapping("/klienti/new")
    public String showNewForm(Model model) {
        model.addAttribute("klienti", new Klienti());
        model.addAttribute("pageTitle", "Add New Klienti");
        return "klienti_form";
    }

    @PostMapping("/klienti/save")
    public String saveKlienti(Klienti klienti, RedirectAttributes ra) {
        service.save(klienti);
        ra.addAttribute("message", "The user has been saved sucessfully");
        return "redirect:/klienti";
    }

    @GetMapping("/klienti/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ra) {
        try {
            Klienti klienti = service.get(id);
            model.addAttribute("klienti", klienti);
            model.addAttribute("pageTitle", "Edit Klienti (ID: " + id + ")");
            return "klienti_form";
        } catch (KlientiNotFoundException e) {
            e.printStackTrace();

        }


    }
}