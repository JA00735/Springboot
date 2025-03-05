package com.jesus.curso.springboot.webapp.controllers;

import com.jesus.curso.springboot.webapp.models.dto.paramsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamController {

    @GetMapping("/foo")
    public paramsDto foo(@RequestParam (required = false, defaultValue = "hola culito chuuy") String message){
    paramsDto param = new paramsDto();
    param.setMessage(message);
    return param;
    }
}
