package com.niru.interview;

import com.niru.dto.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeSalaryIfEqualSortName {
    public static void main(String[] args) {
        List<Student> studentList = getStudentList();

        Collections.sort(studentList, new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                int compare = Double.compare(o1.getSalary(), o2.getSalary());
                if(compare == 0){
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return compare;
                }
            }
        });

        System.out.println(studentList);

        //=====================================================
        System.out.println();

        List<Student> collect = studentList.stream().sorted(Comparator.comparingDouble(Student::getSalary).thenComparing(Student::getName))
                .collect(Collectors.toList());
        System.out.println(collect);
    }



    public static List<Student> getStudentList(){
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Aani", 2000));
        list.add(new Student(2, "Moxi", 1000));
        list.add(new Student(3, "Aaj", 2000));
        list.add(new Student(3, "Kanni", 3000));

        return list;
    }
}
