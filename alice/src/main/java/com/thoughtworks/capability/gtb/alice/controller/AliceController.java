package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AliceController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public String hello(RestTemplate restTemplate) {

        return restTemplate.getForObject("http://localhost:8081/hello", String.class);
    }
}
