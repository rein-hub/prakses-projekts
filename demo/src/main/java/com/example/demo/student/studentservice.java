package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class studentservice {
	
	
	public List<student> getStudents() {
		return List.of(
				new student(
						1L,
						"Mario",
						"bigdongMario@gmail.com",
						LocalDate.of(2000, Month.JANUARY, 5),
						21
						)
				);
				
	}
}
