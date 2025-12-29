package com.example.demo.demo.employee;

import com.example.demo.demo.model.employee.LoginRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiService {


    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }


    @GetMapping("/hello/{name}")
    public String helloWithName(@PathVariable String name) {
        return "Hello " + name;
    }


    @PostMapping("/helloworld")
    public String login(@RequestBody LoginRequest request) {

        if ("shazma".equals(request.getUsername()) &&
                "1234".equals(request.getPassword())) {
            return "Hello World";
        }

        return "Invalid username or password";
    }
}