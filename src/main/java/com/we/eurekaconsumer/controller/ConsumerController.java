package com.we.eurekaconsumer.controller;

import com.we.eurekaconsumer.client.ProducerClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ProducerClient service;

    @GetMapping("/today")
    public String getTodayTime(){
        return "Today"+service.getTime();
    }
    
}
