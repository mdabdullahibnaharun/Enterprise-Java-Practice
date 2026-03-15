package com.mdabdullaih.main.controller;

import com.mdabdullaih.main.model.Student;
import com.mdabdullaih.main.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    private final StudentService studentService;
    public MainController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/student/all")
    public List<Student> getAllStudents(){
        return studentService.getAllStudentFromDB();
    }

    @GetMapping("/student/{id}")
    public List<Student> getStudentById(@PathVariable Integer id){
        return studentService.getAllStudentByIdFromDB(id);
    }

    @PostMapping("/student")
    public Student saveStudentFromDB(@RequestBody Student student){
        return studentService.saveStudentToDB(student);
    }

    @GetMapping("/student/gender/{gender}")
    public List<Student> getStudentById(@PathVariable String gender){
        return studentService.findStudentByGender(gender);
    }




}
