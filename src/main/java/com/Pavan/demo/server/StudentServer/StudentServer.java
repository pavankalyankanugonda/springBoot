package com.Pavan.demo.server.StudentServer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {
    //1. Store the Student
    @PostMapping("/create")
    public String storeStudent(){
        return """
            id : 1
            name : Pavan
            Department : CSE
            age : 25
            """;
    }

    //2. Read the Studentr with id

    //3. Update the student information

    //4.Delete the student infromation

}
