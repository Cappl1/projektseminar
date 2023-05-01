package com.example.demo.student;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student sucuk =new Student(
                                "sucuk",
                                "sucuk@scharfewurst.com",
                                LocalDate.of(2000, Month.JANUARY,5)
			                    );
            Student brat =new Student(
                                "brat",
                                "brat@pfanne.com",
                                LocalDate.of(2001, Month.JANUARY,7)
			                    );
            repository.saveAll(List.of(sucuk, brat));
        };
    }
    
}
