package com.example.serviceB.serviceImplementation;

import com.example.serviceB.entity.Mobile;
import com.example.serviceB.repository.ServiceBRepository;
import com.example.serviceB.service.ServiceBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceBServiceImplementation implements ServiceBService {

    @Autowired
    private ServiceBRepository serviceBRepository;

    public Mobile saveServiceA(Mobile mobile){
        Mobile mobile1 = serviceBRepository.save(mobile);
        return mobile1;
    }
}
