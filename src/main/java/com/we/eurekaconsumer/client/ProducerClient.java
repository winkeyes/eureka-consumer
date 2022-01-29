package com.we.eurekaconsumer.client;

 
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="eureka-producer" )
public interface ProducerClient {
    @GetMapping("/time")
    String getTime();
    
     
}
