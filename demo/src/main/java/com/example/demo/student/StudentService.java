package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;


import org.springframework.stereotype.Service;

import java.time.Month;

@Service
public class StudentService {
    public List<Student> getStudents(){
		return List.of(
			new Student(
				1L,
				"fuck",
				"hs@fickdichdoch.com",
				LocalDate.of(2000, Month.JANUARY,5),
				21
			)
		);
	}
}
