package com.alison.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @Author alison
 * @Date 2019/5/26  8:23
 * @Version 1.0
 */
@RestController
public class ZikController {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hi")
    public String callHome() {
        System.out.println("call trace service-hi ");
        return restTemplate.getForObject("http://localhost:1003/hi", String.class);
    }

    @GetMapping("/info")
    public String info() {
        System.out.println("calling trace service-zipkin ");
        return "i'm service-zipkin";
    }


}
