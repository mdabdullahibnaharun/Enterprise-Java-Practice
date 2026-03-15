package com.mdabdullaih.main.repository;

import com.mdabdullaih.main.model.Laptop;
import com.mdabdullaih.main.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Integer> {


}
