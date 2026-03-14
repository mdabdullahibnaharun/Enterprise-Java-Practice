package com.mdabdullaih.main.service;

import com.mdabdullaih.main.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users = new ArrayList<User>();

    public UserService() {
        System.out.println("UserService: constructor: Called");
    }

    public void addUser(User user){
        users.add(user);
    }
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
}
