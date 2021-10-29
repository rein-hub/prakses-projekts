package com.example.Projekts3;

import com.example.Projekts3.Klienti.Klienti;

import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.Scanner;

public class KlientiNotFoundException extends Throwable {
    public KlientiNotFoundException(String message) {
        super(message);
    }

    public KlientiNotFoundException() {

    }
}
