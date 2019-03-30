package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;




    @SpringBootTest
    @RunWith(SpringRunner.class)
    public class ClassroomConfigTest {
        @Autowired
        @Qualifier("currentCohort")
        Classroom currentClassroom;
        @Autowired @Qualifier("students")
        Students students;
        @Autowired
        Instructors instructors;


        @Autowired @Qualifier("prevCohort")
        Classroom prevClassroom;
        @Autowired @Qualifier("prevStudents")
        Students prevStudents;
        @Test
        public void testPreviousCohortStudents() {
            //Given
            Students expected = prevStudents;

            //When
            Students actual = prevClassroom.getStudents();

            //Then
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void testPreviousCohortInstructors() {
            //Given
            Instructors expected = instructors;

            //When
            Instructors actual = prevClassroom.getInstructors();

            //Then
            Assert.assertEquals(expected, actual);
        }




        @Test
        public void testCurrentCohortStudents() {
            //Given
            Students expected = students;

            //When
            Students actual = currentClassroom.getStudents();

            //Then
            Assert.assertEquals(expected, actual);
        }
        @Test
        public void testCurrentCohortInstructors(){
            //Given
            Instructors expected = instructors;

            //When
            Instructors actual = currentClassroom.getInstructors();

            //Then
            Assert.assertEquals(expected, actual);
        }

    }
