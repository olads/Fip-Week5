package com.migia.week5.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.migia.week5.service.MyService;

@RestController
public class EndpointController{

    MyService service;

    public EndpointController(MyService service){
        this.service = service;
    } 
    
    @GetMapping("/name")
    public String getName(){

        return service.getName();
    }

    @GetMapping("/week")
    public String getFIPWeek(){
        return service.getFIPWeek();
    }
}