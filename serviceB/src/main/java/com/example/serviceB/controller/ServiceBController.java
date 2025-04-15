package com.example.serviceB.controller;

import com.example.serviceB.entity.Mobile;
import com.example.serviceB.service.ServiceBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ServiceBController {
    @Autowired
    public ServiceBService service;

    @Autowired
    public KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/saveB")
    public Mobile saveServiceA(@RequestBody Mobile mobile) {
        Mobile mobile1 = service.saveServiceA(mobile);
        kafkaTemplate.send("Mobile_Topic", "Key", mobile.toString());
        return mobile1;
    }

}
