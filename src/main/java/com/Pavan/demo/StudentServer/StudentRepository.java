package com.Pavan.demo.StudentServer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//public class StudentRepository {
    public interface StudentRepository extends JpaRepository<Student, Integer> {

    }
    //public Student save(Student student) {
//        System.out.println("StudentRepository save method");
//        return student;
    //}
//}
