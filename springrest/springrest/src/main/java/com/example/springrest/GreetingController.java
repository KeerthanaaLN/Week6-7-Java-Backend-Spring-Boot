package com.example.springrest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "Guest") String name) {
        return "Hello, " + name + "! Welcome to the Greeting App.";
    }

    @GetMapping("/greet/{name}")
    public String greetWithPath(@PathVariable String name) {
        return "Hi, " + name + "! Nice to see you here.";
    }

    @PostMapping("/meet")
    public String postGreeting(@RequestBody String name) {
        return "Hello from POST, " + name + "!";
    }
}
