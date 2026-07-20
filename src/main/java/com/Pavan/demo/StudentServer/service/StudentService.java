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

    // CREATE
    public Student validateStudent(Student student) {

        if (student == null) {
            return null;
        }

        if (student.getName() == null || student.getName().trim().isEmpty()) {
            return null;
        }

        if (student.getAge() <= 0) {
            return null;
        }

        if (student.getDepartment() == null || student.getDepartment().trim().isEmpty()) {
            return null;
        }

        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());

        return studentRepository.save(student);
    }

    // GET BY ID
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    // GET ALL
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // UPDATE
    public Student updateStudent(Integer id, Student updatedStudent) {

        Student existingStudent = studentRepository.findById(id).orElse(null);

        if (existingStudent == null) {
            return null;
        }

        if (updatedStudent.getName() == null || updatedStudent.getName().trim().isEmpty()) {
            return null;
        }

        if (updatedStudent.getAge() <= 0) {
            return null;
        }

        if (updatedStudent.getDepartment() == null || updatedStudent.getDepartment().trim().isEmpty()) {
            return null;
        }

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setAge(updatedStudent.getAge());
        existingStudent.setDepartment(updatedStudent.getDepartment());
        existingStudent.setUpdatedAt(LocalDateTime.now());

        return studentRepository.save(existingStudent);
    }

    // DELETE
    public String deleteStudentById(Integer id) {

        Student existingStudent = studentRepository.findById(id).orElse(null);

        if (existingStudent == null) {
            return "Student Not Found";
        }

        studentRepository.delete(existingStudent);

        return "Student Deleted Successfully";
    }
}