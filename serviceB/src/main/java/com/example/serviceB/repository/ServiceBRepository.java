package com.example.serviceB.repository;

import com.example.serviceB.entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceBRepository extends JpaRepository<Mobile, Integer> {
}
