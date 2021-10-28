package com.example.Projekts3;

import com.example.Projekts3.Klienti.Klienti;
import com.example.Projekts3.Klienti.KlientiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MainService {

    @Autowired private KlientiRepository repo;


    public List<Klienti> listAll(){
         return (List<Klienti>) repo.findAll();
    }

    public void save(Klienti klienti) {
        repo.save(klienti);
    }

    public Klienti get(Integer id){
     Optional<Klienti> result = repo.findById(id);
     if (result.isPresent()){
         return result.get();
     }
     throw new KlientiNotFoundException();
    }
}
