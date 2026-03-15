package com.mdabdullaih.main.repository;

import com.mdabdullaih.main.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentReposetory extends JpaRepository<Student,Integer> {

    public List<Student> findByGender(String gender);
    public List<Student> findByGenderAndName(String gender, String name);

}
