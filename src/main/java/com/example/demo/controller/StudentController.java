package com.example.demo.controller;

import com.example.demo.dao.StudentJdbc;
import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentJdbc studentJdbc;

    public StudentController(StudentJdbc studentJdbc) {
        this.studentJdbc = studentJdbc;
    }

    // показать студента по id
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentJdbc.get(id);
    }

    // показать всех студентов
    @GetMapping("/student/show_all")
    public List<Student> showAll() {
        return studentJdbc.showAll();
    }

    // показать по группе
    @GetMapping("/student/group_id/{group_id}")
    public List<Student> showByGroup(@PathVariable int group_id) {
        return studentJdbc.showByGroup(group_id);
    }

    // показать студента по имени
    @GetMapping("/student/name/{student_name}")
    public List<Student> showByName(@PathVariable String student_name) {
        return studentJdbc.showByName(student_name);
    }
}