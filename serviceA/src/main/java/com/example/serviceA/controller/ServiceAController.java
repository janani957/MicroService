package com.example.serviceA.controller;

import com.example.serviceA.entity.Mobile;
import com.example.serviceA.service.ServiceAService;
import com.example.serviceA.serviceImplementation.ServiceAServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ServiceAController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    public ServiceAService service;

    @PostMapping("/saveA")
    public Mobile saveServiceA(@RequestBody Mobile mobile){
        Mobile mobile1 = restTemplate.postForObject("http://localhost:8883/saveB",mobile , Mobile.class);
        return service.saveServiceA(mobile1);
    }
}
