package com.mdabdullaih.main.controller;

import com.mdabdullaih.main.model.Student;
import com.mdabdullaih.main.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JdbcController {

    private final StudentService studentService;
//    @Autowired
    public JdbcController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public ResponseEntity<?> saveStudent(@RequestBody Student student) {
        studentService.saveStudentInDatabase(student);
        return new ResponseEntity<>("student info saved", HttpStatus.CREATED);
    }

    @GetMapping("/student/name/{id}")
    public ResponseEntity<?> getStudentName(@PathVariable Integer id) {
        String sname = studentService.getStudentNameFromDatabase(id);
        return new ResponseEntity<>("student name found: "+sname, HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Integer id) {
        Student student = studentService.getStudentFromDatabase(id);
        return new ResponseEntity<>("student found: "+student, HttpStatus.OK);
    }

    @GetMapping("/student/all")
    public ResponseEntity<?> getAllStudents() {
        List <Student> students = new ArrayList<>();
        students = studentService.getAllStudentFromDatabase();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }


}
