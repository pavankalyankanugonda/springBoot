package com.Pavan.demo.StudentServer;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public Student save(Student student) {
        System.out.println("StudentRepository save method");
        return student;
    }
}
