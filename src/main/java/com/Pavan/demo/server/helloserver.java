package com.Pavan.demo.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServer {


    @GetMapping("/hello")
    public String hello(){
        return "<h1>hello Pavan</h1>";
    }

}