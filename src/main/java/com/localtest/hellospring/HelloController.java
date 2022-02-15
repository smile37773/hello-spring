package com.localtest.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {
    /**
     * http://localhost:8080/hello
     */
    @GetMapping("/hello")
    public String world() {
        return "(test)Hello, world @" + new Date().toString() + "!";
    }
}
