package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student ilia = new Student("Ilia",
                    "ilya.ns2000@gmail.com",
                    LocalDate.of(1998, Month.AUGUST, 27));
            Student anton = new Student("Anton",
                    "anton@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 11));
            repository.saveAll(List.of(ilia,anton));
        };
    }
}
