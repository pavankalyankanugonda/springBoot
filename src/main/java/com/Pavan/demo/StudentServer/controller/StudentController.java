package com.Pavan.demo.StudentServer.controller;

import com.Pavan.demo.StudentServer.entity.Student;
import com.Pavan.demo.StudentServer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> storeStudent(@RequestBody Student student) {

        Student result = studentService.validateStudent(student);

        if (result == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.status(201).body(result);
    }
}