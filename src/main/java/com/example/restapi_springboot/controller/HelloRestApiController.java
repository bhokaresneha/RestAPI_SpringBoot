package com.example.restapi_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/home")
public class HelloRestApiController {

    @GetMapping("/hello")
    public String displayMessage() {
        return "Hello from Bridgelabz";
    }
     @GetMapping("/msg/{name}")
    public String displayMessageWithName(@PathVariable String name){
        return "hello demo 1 msg"+name+"!";
    }

}
