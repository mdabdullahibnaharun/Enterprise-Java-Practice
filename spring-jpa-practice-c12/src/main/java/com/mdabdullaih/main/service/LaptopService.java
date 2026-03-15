package com.mdabdullaih.main.service;

import com.mdabdullaih.main.model.Laptop;
import com.mdabdullaih.main.repository.LaptopRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LaptopService {

    private final LaptopRepository laptopRepository;
    public LaptopService(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    public Laptop saveLaptopToDB(Laptop laptop){
        return laptopRepository.save(laptop);
    }

//    public Laptop getLaptopFromDB(Laptop laptop){
//        return laptopRepository.findById(laptop.getId()).get();
//    }

    public Laptop getLaptop(Integer id){
        Optional<Laptop> optionalLaptop = laptopRepository.findById(id);
        return optionalLaptop.orElse(null);
    }


}
