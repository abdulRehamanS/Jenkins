package com.example.Jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
    }

    @GetMapping(value = "/welcome")
    public String welcome() {
        return "Welcome to Jenkins";
    }

}
