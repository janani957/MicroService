package com.example.serviceC.controller;


import com.example.serviceC.entity.Mobile;
import com.example.serviceC.service.ServiceCService;
import com.example.serviceC.serviceImplementation.ServiceCServiceImplementation;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ServiceCConsumer {

    @Autowired
    public ServiceCService service;

    @KafkaListener(topics = "Mobile_Topic",groupId = "my-group")
    public void saveServiceC(String mobile){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Mobile mobile1 = objectMapper.readValue(mobile , Mobile.class);
            service.save(mobile1);
        }catch (Exception e){}
    }
}
