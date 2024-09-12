package com.niru.interview;

import com.niru.dto.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        //Find second Highest salary of student
        //Find distinct students

        List<Student> students = Arrays.asList(new Student(1, "Mani", 1000),
                new Student(2, "Moxi", 3000),
                new Student(3, "Raj", 5000),
                new Student(2, "Moxi", 3000));

        //Print Second Highest Salary
        students.stream()
                .map(Student::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresentOrElse(salaray-> System.out.println("Second Highest salary: " + salaray),
                        () -> System.out.println("Not Found..!"));

        //Remove duplicates from List of Students.
        students.stream().distinct().forEach(System.out::println);

        students.stream().map(m-> m.getSalary() + 10)
                .forEach(System.out::println);

        students.stream().filter(e->e.getSalary() < 3000)
                .forEach(System.out::println);
    }
}
