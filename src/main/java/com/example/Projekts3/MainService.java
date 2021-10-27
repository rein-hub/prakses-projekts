package com.example.Projekts3;

import com.example.Projekts3.Klienti.Klienti;
import com.example.Projekts3.Klienti.KlientiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MainService {

    @Autowired
    KlientiRepository repo;

    public Klienti save() {

        Klienti klienti = new Klienti();
        klienti.setEpasts("janis.@gmail.com");
        klienti.setParole("1234455566");
        klienti.setVards("Janis");
        klienti.setUzvards("Kalnins");
        return         repo.save(klienti);
    }

    public Klienti getKlienti(){

        return repo.findById(1).get();

    }
    public Iterable<Klienti> listAll(){
         return  repo.findAll();
    }
}
