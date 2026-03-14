package com.mdabdullaih.main.controller;

import com.mdabdullaih.main.Model.User;
import com.mdabdullaih.main.service.UserService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class MainController {
    //field level injection
//    @Autowired
    private final UserService userService;

    //constructor Injection
    public MainController(UserService userService) {
        this.userService = userService;
        System.out.println("MainController : Created");
    }

//    @RequestMapping("/home")
//    public String getHomePage(ModelMap modelMap) {
//        System.out.println("HomeController : Called");
//
//        String demoName = "ModelMap";
////        ModelMap modelMap = new ModelMap();
//        modelMap.put("name", demoName);
//
//        return "HomePage.html";
//    }

    @RequestMapping("/home")
    public ModelAndView getHomePage(ModelAndView modelAndView, @RequestParam @Nullable String sucess) {
        System.out.println("HomeController : Called");

        String demoName = "Model and View";
//        ModelMap modelMap = new ModelMap();
        modelAndView.addObject("name", demoName);
        modelAndView.setViewName("HomePage");
        modelAndView.addObject("message", sucess);

        return modelAndView;
    }

    @RequestMapping("/modelpage")
    public String getModelPage(Model model) {
        System.out.println("ModelController : Called");

        String demoName = "Model";
//        ModelMap modelMap = new ModelMap();
        model.addAttribute("name", demoName);

        return "ModelPage.html";
    }

    @RequestMapping("/modelandview")
    public ModelAndView getModelAndView(ModelAndView mav) {
        System.out.println("ModelController : Called");
//        ModelAndView mav = new ModelAndView();
        mav.setViewName("ModelAndView.html");
        mav.addObject("name", "ModelAndView");
        return mav;
    }

//    @RequestMapping("/another-page")
//    public String getAnotherPage(){
//        System.out.println("AnotherPageController : Called");
//        return "AnotherPage.html";
//    }

    @RequestMapping("/another-page")
    public ModelAndView getAnotherPage(ModelAndView mav) {
        System.out.println("AnotherPageController : Called");
        mav.setViewName("AnotherPage.html");
        return mav;
    }

//    @PostMapping("/submit")
//    public ModelAndView submitUserData(ModelAndView mav, RedirectAttributes redirectAttributes, @RequestParam @Nullable String fullname, @RequestParam
//    @Nullable Integer age, @RequestParam @Nullable String email) {
//
//        System.out.println("submitUserDataController : Called");
//        System.out.println("fullname: " + fullname + " age: " + age + " email: " + email);
//
////        mav.addObject("fullname", fullname);
////        mav.addObject("age", age);
////        mav.addObject("email", email);
////        mav.addObject("success", "Data Saved Successfully!!");
////        redirectAttributes.addFlashAttribute("success", " Data Saved Successfully!!");
//        redirectAttributes.addAttribute("success", " Data Saved Successfully!!");
//        mav.setViewName("redirect:/home");
//        return mav;
//    }

@PostMapping("/submit")
    public ModelAndView submitUserData(ModelAndView mav, RedirectAttributes redirectAttributes, @ModelAttribute User user) {

        System.out.println("submitUserDataController : Called");

        System.out.println("submitUserDataController : user = " + user);
//        mav.addObject("fullname", fullname);
//        mav.addObject("age", age);
//        mav.addObject("email", email);
//        mav.addObject("success", "Data Saved Successfully!!");
//        redirectAttributes.addFlashAttribute("success", " Data Saved Successfully!!");
        redirectAttributes.addAttribute("success", " Data Saved Successfully!!");
        mav.setViewName("redirect:/home");
        return mav;
    }

    @GetMapping("/user-details")
    public ModelAndView viewUserData(ModelAndView mav) {

        System.out.println("viewUserDataController : Called");
        mav.setViewName("UserDetails");
        List<User> userList = userService.getUsers();
        mav.addObject("userList", userList);
        return mav;
    }
}
