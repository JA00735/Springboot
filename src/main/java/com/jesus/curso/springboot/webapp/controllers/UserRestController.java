package com.jesus.curso.springboot.webapp.controllers;

import com.jesus.curso.springboot.webapp.models.User;
import com.jesus.curso.springboot.webapp.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){
        UserDto userDto = new UserDto();
        User user=new User("chuy","aguilar");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){
        User user=new User("Chuy", "Aguilar");
        User user1=new User("Irving", "Aguilar");
        User user2=new User("Zeferino", "Aguilar");
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user1);
        return users;
    }



   /*@GetMapping("/details")
    public Map<String, Object> details() {
        User user=new User("chuy", "aguilar");
        Map<String, Object> body=new HashMap<>();
        body.put("title","hola mundo spring boot");
        body.put("user",user);
        return body;
    }*/
}
