package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean(name = "usaInstructors")
    public Instructors tcUsaInstructors() {
        return new Instructors(new Instructor(0, "Janae"), new Instructor(1, "Zana"),
                new Instructor(2, "Taylor"));
    }

    @Bean(name = "ukInstructors")
    public Instructors tcUkInstructors() {
        return new Instructors(new Instructor(0, "Teyana T"), new Instructor(1, "Iman"),
                new Instructor(2, "Lauren Londan"), new Instructor(3, "PNB ROCK"), new Instructor(4, "Trey Songs"));
    }

    @Primary
    @Bean
    public Instructors instructors() {
        return new Instructors(new Instructor(0, "Leon"), new Instructor(1, "Kris"),
                new Instructor(2, "Nhu"), new Instructor(3, "Dolio"),
                new Instructor(4, "Wilhem"));
    }
}