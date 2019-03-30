package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




// static block - executed at the time of loading a class for use in a Java application
    // static field - all instances of any class will access the same static field variable.

    @Configuration
    public class StudentConfig {
        private static Student[] currentStudents = new Student[41];
        private static String[] currentStudentNames = new String[]{"Ajah",
                "Alex", "Ashley B.", "Ashley S.", "Aswathy", "Brian",
                "Cara", "Charles", "Cristina", "David", "Davis", "Delenda",
                "Eleonor", "Eric", "Francisco", "Jim", "Joseph", "Julian",
                "Jutta", "Kat", "Kate", "Kyle", "Laxmi", "Leah", "Mark", "Marlys",
                "Marshilla", "Michael", "Neela", "Nirmala", "Reese",
                "Robyn", "Sean Green", "Sean Grey", "Shuchi", "Sravani",
                "Sunhyun", "Swampna", "Swathi", "William", "Yang"};

        private static Student[] prevStudents = new Student[29];
        private static String[] prevStudentNames = new String[]{"Allison", "April", "Beau", "Brandon", "Brian", "David", "Demetrius", "Eugene", "Steffon", "Frankie",
                "Khalil", "Rachelle", "Whitney", "Jenn", "Michelle", "Tommy", "Sean", "X", "Ray", "Kevin", "Simon", "Veronica",
                "Elliot", "Conner", "Kaleb", "Mark", "Jared", "Sam", "Maggie",};

        static {
            for (int i = 0; i < 41; i++) {
                currentStudents[i] = new Student(i, currentStudentNames[i]);
                if (i < 29) {
                    prevStudents[i] = new Student(i, prevStudentNames[i]);
                }
            }
        }


        @Bean(name = "students")
        public Students currentStudents() {
            return new Students(currentStudents);
        }

        @Bean(name = "prevStudents")
        public Students prevStudents() {
            return new Students(prevStudents);
        }
    }


