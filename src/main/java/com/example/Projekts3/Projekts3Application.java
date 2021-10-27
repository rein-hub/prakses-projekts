package com.example.Projekts3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootApplication
public class Projekts3Application {

	public static void main(String[] args) {
		SpringApplication.run(Projekts3Application.class, args);

	}

}
