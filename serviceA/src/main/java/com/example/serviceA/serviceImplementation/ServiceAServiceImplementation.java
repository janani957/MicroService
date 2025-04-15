package com.example.serviceA.serviceImplementation;

import com.example.serviceA.entity.Mobile;
import com.example.serviceA.repository.ServiceARepository;
import com.example.serviceA.service.ServiceAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ServiceAServiceImplementation implements ServiceAService {

    @Autowired
    private ServiceARepository serviceARepository;

    public Mobile saveServiceA(Mobile  mobile){
        Mobile mobile1 = serviceARepository.save(mobile);
        return mobile1;
    }
}
