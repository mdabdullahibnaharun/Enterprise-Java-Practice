package com.mdabdullaih.main.service;

import com.mdabdullaih.main.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StudentService {

    private final JdbcTemplate jdbcTemplate;

//    @Autowired
    public StudentService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveStudentInDatabase(Student student) {
        String sql = "insert into students (id, name, gender) values(?,?,?)";
        jdbcTemplate.update(sql,student.getId(),student.getName(),student.getGender());
    }

    public String getStudentNameFromDatabase(Integer id) {
        String sql = "select name from students where id = ?";
        return jdbcTemplate.queryForObject(sql, String.class,id);
    }

    public Student getStudentFromDatabase(Integer id) {
        String sql = "select * from students where id = ?";
        return jdbcTemplate.queryForObject(sql, (result, rowNum) -> {
            Student student = new Student();
            student.setId(result.getInt("id"));
            student.setName(result.getString("name"));
            student.setGender(result.getString("gender"));
            return student;
        }, id);
    }

    public List<Student> getAllStudentFromDatabase() {
        String sql = "select * from students";
        return jdbcTemplate.query(sql, (result, rowNum) -> {
            Student student = new Student();
            student.setId(result.getInt("id"));
            student.setName(result.getString("name"));
            student.setGender(result.getString("gender"));
            return student;
        });
    }



}
