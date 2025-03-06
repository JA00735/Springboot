package com.jesus.curso.springboot.webapp.controllers;

import com.jesus.curso.springboot.webapp.models.User;
import com.jesus.curso.springboot.webapp.models.dto.ParamDto;
import com.jesus.curso.springboot.webapp.models.dto.ParamsDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${Value.name}")
    private String name;
    @Value("${Value.lastname}")
    private String lastname;
    @Value("${Value.id}")
    private Integer id;
    @Value("${Value.list}")
    private String[] list;

    @GetMapping("/path/{mensaje}")
    public ParamDto param (@PathVariable String mensaje){

        ParamDto path = new ParamDto();
        path.setMensaje(mensaje);
        return path;
    }

@GetMapping("/mix/{producto}/{id}")
    public Map<String,Object> pathvar (@PathVariable String producto,@PathVariable Long id){

       Map<String,Object> paths = new HashMap<>();
       paths.put("producto",producto);
       paths.put("id",id);
       return paths;
}

@PostMapping("/save")
    public User guardar (@RequestBody User user){
    user.setName(user.getName().toUpperCase());
    user.setLastname(user.getLastname().toLowerCase());
        return user;
}

@GetMapping("/value")
    public Map<String,Object> ejemplo(){
        Map<String,Object> json=new HashMap<>();
        json.put("name",name);
        json.put("lastname",lastname);
        json.put("id",id);
        json.put("list",list);
        return json;
}
}
