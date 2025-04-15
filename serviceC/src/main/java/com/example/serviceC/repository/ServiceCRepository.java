package com.example.serviceC.repository;

import com.example.serviceC.entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceCRepository extends JpaRepository<Mobile, Integer> {
}
