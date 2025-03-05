package com.jesus.curso.springboot.webapp.controllers;

import com.jesus.curso.springboot.webapp.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @GetMapping("/details2")
    public String details(Model model){
        User user = new User("chuy", "aguilar");
        model.addAttribute("title", "hola mundo spring boot");
        model.addAttribute("user",user);
        return "details";

    }

    @GetMapping("/list")

    public String list (ModelMap model){
        List<User> user = Arrays.asList(new User("jesus", "aguilar"),
                new User("irving", "auilar"),
                new User("graciela", "dorantes"),
                new User("zeferino", "aguilar"));

        model.addAttribute("user", user);
        model.addAttribute("title", "Hola Mundo Spring Boot");

        return "list";
    }
}
