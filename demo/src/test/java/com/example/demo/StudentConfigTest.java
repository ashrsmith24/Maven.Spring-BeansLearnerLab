package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentConfigTest {
    @Autowired
    @Qualifier("students")
    Students currentStudents;


    @Autowired
    @Qualifier("prevStudents")
    Students prevStudents;

    @Test
    public void testPreviousStudentsLength() {
        //Given
        int expected = 29;

        //When
        int actual = prevStudents.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStudentsNames() {
        //Given
        String[] previousStudentNames = new String[]{ "Allison", "April", "Beau", "Brandon","Brian", "David", "Demetrius","Eugene", "Steffon", "Frankie",
                "Khalil", "Rachelle",  "Whitney", "Jenn", "Michelle", "Tommy",  "Sean", "X", "Ray",  "Kevin", "Simon", "Veronica",
                "Elliot", "Conner", "Kaleb", "Mark", "Jared", "Sam","Maggie",};

        List<String> expected = new ArrayList<>(Arrays.asList(previousStudentNames));

        //When
        List<Student> actualPreviousStudents = prevStudents.getPersonList();

        //Then
        actualPreviousStudents.forEach(student -> Assert.assertTrue(expected.contains(student.getName())));
    }

    @Test
    public void testCurrentStudentsLength() {
        //Given
        int expected = 41;

        //When
        int actual = currentStudents.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStudentNames() {
        //Given
        String[] currentStudentNames = new String[]{"Ajah",
                "Alex", "Ashley B.", "Ashley S.", "Aswathy", "Brian",
                "Cara", "Charles", "Cristina", "David", "Davis", "Delenda",
                "Eleonor", "Eric", "Francisco", "Jim", "Joseph", "Julian",
                "Jutta", "Kate", "Kate", "Kyle", "Laxmi", "Leah", "Mark", "Marlys",
                "Marshilla", "Michael", "Neela", "Nirmala", "Reese",
                "Robyn", "Sean Green", "Sean Grey", "Shuchi", "Sravani",
                "Sunhyun", "Swampna", "Swathi", "William", "Yang"};

        List<String> expected = new ArrayList<>(Arrays.asList(currentStudentNames));
        //When
        List<Student> actualCurrentStudents = currentStudents.getPersonList();

        //Then
        actualCurrentStudents.forEach(student -> Assert.assertTrue(expected.contains(student.getName())));
    }
}