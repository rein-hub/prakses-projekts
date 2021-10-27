package com.example.Projekts3;


import com.example.Projekts3.Klienti.Klienti;
import com.example.Projekts3.Klienti.KlientiRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class KlientiRepositoryTests {
    @Autowired private KlientiRepository repo;

    @Test
    public void TestAddNew() {
        Klienti klienti = new Klienti();
        klienti.setEpasts("janis.@gmail.com");
        klienti.setParole("1234455566");
        klienti.setVards("Janis");
        klienti.setUzvards("Kalnins");

       Klienti savedKlienti = repo.save(klienti);

        Assertions.assertThat(savedKlienti).isNotNull();
        Assertions.assertThat(savedKlienti.getId()).isGreaterThan(0);
    }
    @Test
    public void testListAll() {
        Iterable<Klienti> klienti = repo.findAll();
        Assertions.assertThat(klienti).hasSizeGreaterThan(0);

        for (Klienti klients : klienti) {
            System.out.println(klients);
        }
    }
    @Test
    public void testUpdate() {

        Optional<Klienti> optionalKlienti = repo.findById(klientiId);
        Integer klientiId = 1;
        Klienti klienti = optionalKlienti.get();
        klienti.setParole("hello");
        repo.save(klienti);

        Klienti updateKlienti = repo.findById(klientiId).get();
        Assertions.assertThat(updateKlienti.getParole()).isEqualTo("hello");

    }
    @Test
    public void testGet() {
        Optional<Klienti> optionalKlienti = repo.findById(klientiId);
        Integer klientiId = 1;
        Klienti klienti = optionalKlienti.get();
    }
}
