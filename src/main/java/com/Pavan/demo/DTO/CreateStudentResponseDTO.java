package com.Pavan.demo.DTO;

import com.Pavan.demo.StudentServer.entity.Student;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

public class CreateStudentResponseDTO {
    private String name;
    private int age;
    private String department;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
