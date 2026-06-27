package com.tao.apis.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello world! welcome to conitnous development";
    }
}

//https://www.meesho.com/api/v1/products/
