package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping(path = "api/v1/student")
	
	
public class studentcontroller {
		
		private final studentservice studentservice;
		
		@Autowired
		public studentcontroller(studentservice studentservice) {
			this.studentservice = new studentservice();
		}
	
		@GetMapping
		public List<student> getStudents() {
			return studentservice.getStudents();
		}
		

	
}
