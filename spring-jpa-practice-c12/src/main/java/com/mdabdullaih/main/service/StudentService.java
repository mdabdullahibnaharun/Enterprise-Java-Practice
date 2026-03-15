package com.mdabdullaih.main.service;

import com.mdabdullaih.main.model.Laptop;
import com.mdabdullaih.main.model.Student;
import com.mdabdullaih.main.repository.LaptopRepository;
import com.mdabdullaih.main.repository.StudentReposetory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final LaptopService laptopService;
    private final StudentReposetory studentReposetory;

    public StudentService (LaptopService laptopService, StudentReposetory studentReposetory) {
        this.laptopService = laptopService;
        this.studentReposetory = studentReposetory;
    }

    public List<Student> getAllStudentFromDB(){
        return studentReposetory.findAll();
    }

    public List<Student> getAllStudentByIdFromDB(Integer id){
        return studentReposetory.findAllById(Collections.singleton(id));
    }

    public Student getStudentByIdFromDb(Integer id){
        Optional<Student> studentOptional = studentReposetory.findById(id);
//        return studentOptional.orElse(null);
        return studentOptional.isPresent() ? studentOptional.get():null;
    }

    public Student saveStudentToDB(Student student){
        List<Laptop> laptopList = new ArrayList<>();

//        if(student.getLaptops()!=null && student.getLaptops().size()>0){
//            for(Laptop laptop : student.getLaptops()){
//                laptopList.add(laptopService.getLaptop(laptop.getId()));
//            }
        //            student.setLaptops(laptopList);

//        }

//        if( !student.getLaptops().isEmpty()){
//            for(Laptop laptop : student.getLaptops()){
//                laptopList.add(laptopService.getLaptop(laptop.getId()));
//            }
//            student.setLaptops(laptopList);
//        }

        if (student.getLaptops() != null) {
            for (Laptop laptop : student.getLaptops()) {
                laptopList.add(laptopService.getLaptop(laptop.getId()));
            }
            student.setLaptops(laptopList);

        }
        return studentReposetory.save(student);
    }

    public List<Student> findStudentByGender(String gender){
        return studentReposetory.findByGender(gender);
    }
}
