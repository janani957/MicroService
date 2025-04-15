package com.example.serviceC.serviceImplementation;


import com.example.serviceC.entity.Mobile;
import com.example.serviceC.repository.ServiceCRepository;
import com.example.serviceC.service.ServiceCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCServiceImplementation implements ServiceCService {

    @Autowired
    public ServiceCRepository serviceCRepository;

    @Override
    public void save(Mobile mobile1) {
        Mobile mobile = serviceCRepository.save(mobile1);
    }
}
