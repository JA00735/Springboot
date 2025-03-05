package com.jesus.curso.springboot.webapp.controllers;

import com.jesus.curso.springboot.webapp.models.dto.ParamsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamController {

    @GetMapping("/foo")
    public ParamsDto foo(@RequestParam (required = false, defaultValue = "hola culito chuuy") String message){
    ParamsDto param = new ParamsDto();
    param.setMessage(message);
    return param;
    }

    @GetMapping("/mult")
    public ParamsDto mult(@RequestParam() String text, @RequestParam() Integer code){
        ParamsDto params = new ParamsDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }
}
