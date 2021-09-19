package com.example.demo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class studentController {
    private final stundentService studentservice;

    @Autowired
    public studentController(stundentService studentservice) {
        this.studentservice = studentservice;
    }

    @GetMapping
    public List<student> getStudents() {
        return studentservice.getStudents();
    }
}
