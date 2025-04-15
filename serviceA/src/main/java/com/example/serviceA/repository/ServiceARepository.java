package com.example.serviceA.repository;

import com.example.serviceA.entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceARepository extends JpaRepository<Mobile,Integer>{
}
