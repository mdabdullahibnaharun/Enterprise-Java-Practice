package com.mdabdullaih.main.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Student {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String gender;
//    @ManyToMany(cascade = CascadeType.ALL)
    @ManyToMany
    List<Laptop> laptops;

//    @OneToOne
//    Laptop laptop;


}
