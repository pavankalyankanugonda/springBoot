package com.Pavan.demo.StudentServer.service;

import com.Pavan.demo.StudentServer.entity.Student;
import com.Pavan.demo.StudentServer.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student validateStudent(Student student) {

        int id = student.getId();
        String name = student.getName();
        int age = student.getAge();
        String department = student.getDepartment();

        if (id < 0 || name == null || name.isBlank()
                || age < 0
                || department == null || department.isBlank()) {
            return null;
        }
        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());

        return studentRepository.save(student);
    }
}