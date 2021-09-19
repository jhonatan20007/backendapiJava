package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class stundentService {
    public List<student> getStudents(){
		return List.of(new student(0,"mariam", "mariam27@gmail.com",LocalDate.of(2000, Month.JANUARY, 5),21));

	}
}
