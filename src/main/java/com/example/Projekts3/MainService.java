package com.example.Projekts3;

import com.example.Projekts3.Klienti.Klienti;
import com.example.Projekts3.Klienti.KlientiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MainService {

    @Autowired private KlientiRepository repo;


    public List<Klienti> listAll(){
         return (List<Klienti>) repo.findAll();
    }
}
