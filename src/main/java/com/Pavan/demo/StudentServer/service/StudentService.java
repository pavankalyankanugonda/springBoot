package com.Pavan.demo.StudentServer.service;

import com.Pavan.demo.StudentServer.entity.Student;
import com.Pavan.demo.StudentServer.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // CREATE STUDENT
    public Student validateStudent(Student student) {

        if (student == null) {
            throw new RuntimeException("Student object cannot be null");
        }

        if (student.getName() == null || student.getName().trim().isEmpty()) {
            throw new RuntimeException("Student name cannot be empty");
        }

        if (student.getAge() <= 0) {
            throw new RuntimeException("Age must be greater than 0");
        }

        if (student.getDepartment() == null || student.getDepartment().trim().isEmpty()) {
            throw new RuntimeException("Department cannot be empty");
        }

        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());

        return studentRepository.save(student);
    }

    // GET STUDENT BY ID
    public Student getStudentById(Integer id) {

        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student Not Found"));
    }

    // GET ALL STUDENTS
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    // UPDATE STUDENT
    public Student updateStudent(Integer id, Student updatedStudent) {

        Student existingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student Not Found"));

        if (updatedStudent.getName() == null || updatedStudent.getName().trim().isEmpty()) {
            throw new RuntimeException("Student name cannot be empty");
        }

        if (updatedStudent.getAge() <= 0) {
            throw new RuntimeException("Age must be greater than 0");
        }

        if (updatedStudent.getDepartment() == null || updatedStudent.getDepartment().trim().isEmpty()) {
            throw new RuntimeException("Department cannot be empty");
        }

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setAge(updatedStudent.getAge());
        existingStudent.setDepartment(updatedStudent.getDepartment());
        existingStudent.setUpdatedAt(LocalDateTime.now());

        return studentRepository.save(existingStudent);
    }

    // DELETE STUDENT
    public String deleteStudentById(Integer id) {

        Student existingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student Not Found"));

        studentRepository.delete(existingStudent);

        return "Student Deleted Successfully";
    }
}