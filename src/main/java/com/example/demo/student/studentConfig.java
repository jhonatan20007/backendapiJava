package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class studentConfig {
    @Bean
    CommandLineRunner commandLineRunner(studentRepository repository) {

        return args -> {
            student mariam = new student(0, "mariam", "mariam27@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21);
            student alex = new student(0, "alex", "alex54@gmail.com", LocalDate.of(2004, Month.JANUARY, 5), 17);

            repository.saveAll(List.of(mariam,alex));
        };
    }

}
