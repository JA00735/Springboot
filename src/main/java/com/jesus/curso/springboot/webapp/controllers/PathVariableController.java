package com.jesus.curso.springboot.webapp.controllers;

import com.jesus.curso.springboot.webapp.models.dto.ParamDto;
import com.jesus.curso.springboot.webapp.models.dto.ParamsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
