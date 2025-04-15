package com.example.serviceC.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Mobile {
    @Id
    private int imeiNo;
    private String model;
    private String ram;
    private String colour;


}
