package com.mdabdullaih.main.Model;


import java.util.List;

public class User {
    private String fullname;
    private Integer age;
    private String email;
    private List<String> hobbies;

    public User()
    {

    }

    public User(String fullname, Integer age, String email)
    {
        this.fullname = fullname;
        this.age = age;
        this.email = email;
    }

    public User(String fullname, Integer age, String email, List<String> hobbies) {
        this.fullname = fullname;
        this.age = age;
        this.email = email;
        this.hobbies = hobbies;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
