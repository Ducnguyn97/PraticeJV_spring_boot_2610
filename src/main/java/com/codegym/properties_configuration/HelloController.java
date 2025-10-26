package com.codegym.properties_configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private int age;

    @Value("${user.address}")
    private String address;
    @GetMapping("/hello")
    public String hello() {
        return "Hello Nguyen Minh Duc, 28, Ha Noi";
    }
    @GetMapping("/user")
    public String user() {
        return "User: " + name + ", age: " + age + ", address: " + address;
    }
}
