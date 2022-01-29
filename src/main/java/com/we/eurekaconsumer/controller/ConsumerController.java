package com.we.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.we.eurekaconsumer.client.ProducerClient;

@RestController
public class ConsumerController {
    @Autowired
    private ProducerClient service;

    @GetMapping("/today")
    @HystrixCommand(fallbackMethod ="fallbackMethod" )
    public String getTodayTime(){
        return "Today :"+service.getTime();
    }
    
    public String fallbackMethod() {
		return "Something went Wrong!";
	}
    
}
