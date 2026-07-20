package com.Pavan.demo.StudentServer.controller;

import com.Pavan.demo.StudentServer.entity.Student;
import com.Pavan.demo.StudentServer.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // 1. CREATE STUDENT
    @PostMapping("/create")
    public ResponseEntity<Student> storeStudent(@RequestBody Student student) {

        Student result = studentService.validateStudent(student);

        if (result == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.status(201).body(result);
    }

    // 2. GET STUDENT BY ID
    @GetMapping("/getStudent/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Integer id) {

        Student student = studentService.getStudentById(id);

        if (student == null) {
            return ResponseEntity.status(404).body("Student Not Found");
        }

        return ResponseEntity.ok(student);
    }

    // 3. GET ALL STUDENTS
    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudents() {

        List<Student> students = studentService.getAllStudents();

        return ResponseEntity.ok(students);
    }

    // 4. UPDATE STUDENT
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateStudent(
            @PathVariable Integer id,
            @RequestBody Student student) {

        Student updatedStudent = studentService.updateStudent(id, student);

        if (updatedStudent == null) {
            return ResponseEntity.status(404).body("Student Not Found");
        }

        return ResponseEntity.ok(updatedStudent);
    }

    // 5. DELETE STUDENT
    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Integer id) {

        String message = studentService.deleteStudentById(id);

        if (message.equals("Student Not Found")) {
            return ResponseEntity.status(404).body(message);
        }

        return ResponseEntity.ok(message);
    }
}