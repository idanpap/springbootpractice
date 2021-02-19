package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.MAY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student daniel = new Student(
                    "Daniel",
                    "daniel.papastratidis@gmail.com",
                    LocalDate.of(1994, MAY, 1)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1998, MAY, 1)
            );
            repository.saveAll(
                    List.of(daniel, alex)
            );
        };
    }
}
