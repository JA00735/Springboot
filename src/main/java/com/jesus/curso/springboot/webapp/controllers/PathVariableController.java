package com.jesus.curso.springboot.webapp.controllers;

import com.jesus.curso.springboot.webapp.models.User;
import com.jesus.curso.springboot.webapp.models.dto.ParamDto;
import com.jesus.curso.springboot.webapp.models.dto.ParamsDto;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

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
}
