package com.mdabdullaih.main.controller;

import com.mdabdullaih.main.Model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class MainController {

    public MainController() {
        System.out.println("MainController: Created");
        super();
    }

//    @RequestMapping("/hello")
//    @GetMapping("/hello")
//    public String hello() {
//        System.out.println("hello From Controller called");
//        return "Hello World!! REST";
//    }

//    @PostMapping("/submit/{username}/email/{email}")
    //Query parameter
//    @PostMapping("/submit")
//    public void submit( @RequestParam String fullname){
//        System.out.println("submit function called");
//        System.out.println("Received Message: "+fullname);
//    }

//    //path parameter
//    @PostMapping("/submit/{fullname}/{age}")
//    public void submit( @PathVariable String fullname, @PathVariable Integer age) {
//        System.out.println("submit function called");
//        System.out.println("Received Message: "+fullname +" "+age);
//    }

//    //path & key parameter
//    @PostMapping("/submit/{fullname}/{age}")
//    public void submit( @PathVariable String fullname, @PathVariable Integer age ,@RequestParam String email) {
//        System.out.println("submit function called");
//        System.out.println("Received Message: "+fullname +" "+age+ " "+email);
//    }

//    //Body parameter
//    @PostMapping("/submit")
//    public void submit(@RequestBody User fullname) {
//        System.out.println("submit function called");
//        System.out.println("Received Message: "+fullname);
//    }

//    @GetMapping("/hello")
//    public Map<String, String> hello() {
//        Map<String, String> map = new HashMap<>();
//        map.put("message", "Hello World!! REST Jason");
//        return map;
//    }

//    @GetMapping("/hello")
//    public Map<String, Object> hello() {
//        Map<String, Object> map = new HashMap<>();
//        map.put("name","kamal");
//        map.put("age",18);
//        map.put("hobby", List.of("coading","cooking"));
//        return map;
//    }


//    // model in body
//    @GetMapping("/hello")
//    public User hello() {
//        User userINfo = new User();
//        userINfo.setFullname("kamal");
//        userINfo.setAge(18);
//        userINfo.setEmail("hobby#fff");
//        userINfo.setHobbies(List.of("sleep", "eat"));
//        return userINfo;
//    }

    // industry standard
    // model in body
    @GetMapping("/hello")
    public ResponseEntity <User> hello() {

        User userINfo = new User();
        userINfo.setFullname("kamal");
        userINfo.setAge(18);
        userINfo.setEmail("hobby#fff");
        userINfo.setHobbies(List.of("sleep", "eat"));

        ResponseEntity <User> response = new ResponseEntity<>(userINfo, HttpStatus.OK);

        return response;
    }



//    //Body parameter
//    @PostMapping("/submit")
//    public void submit(@RequestBody Map<String,Object> user) {
//        System.out.println("submit function called");
//        System.out.println("Received Message: "+ user.get("fullname"));
//        System.out.println("Received Message: "+ user.get("email"));
//    }

//    //Body parameter
//    @PostMapping("/submit")
//    public void submit(@RequestBody User userInfo) {
//        System.out.println("submit function called");
//        System.out.println(userInfo);
//    }

    //Body parameter by Response ENtity
    @PostMapping("/submit")
    public ResponseEntity<Void> submit(@RequestBody User userInfo) {
        System.out.println("submit function called");
        System.out.println(userInfo);
        return  new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
// industry standard
    @GetMapping("/find-user/{id}")
    public ResponseEntity<?> findUserById(@PathVariable Integer id) {
        if (Objects.isNull(id)) {
            Map<String,Object> map = new HashMap<>();
            map.put("message","Null id is not allowed");
            return new ResponseEntity<>(map,HttpStatus.NOT_FOUND);
        }else if(id == 1) {
            User userINfo = new User();
            userINfo.setFullname("kamal");
            userINfo.setAge(18);
            userINfo.setEmail("hobby#fff");
            userINfo.setHobbies(List.of("sleep", "eat"));
            return new ResponseEntity<>(userINfo,HttpStatus.OK);
        }else {
            Map<String,Object> map = new HashMap<>();
            map.put("message","user not found in this id");
            return new ResponseEntity<>(map,HttpStatus.CONFLICT);
        }
    }

}
