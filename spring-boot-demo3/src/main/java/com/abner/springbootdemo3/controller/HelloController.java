package com.abner.springbootdemo3.controller;

import com.abner.springbootdemo3.pojo.Student;
import com.abner.springbootdemo3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.security.pkcs11.P11Util;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    private UserService userService;
    @GetMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
    @GetMapping("/user/showUser")
    public String showUser(Model model){
        List<Student> students = userService.findStudents();
        model.addAttribute("students",students);
        return "listUser";
    }
}
