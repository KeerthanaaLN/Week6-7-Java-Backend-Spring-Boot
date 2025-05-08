package com.example.springdemo;

public class College {
    private Student student;

    // Constructor-based injection
    public College(Student student) {
        this.student = student;
    }

    public void start() {
        student.study();
    }
}
