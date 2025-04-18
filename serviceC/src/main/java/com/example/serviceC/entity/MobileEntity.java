package com.example.serviceC.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MobileEntity {
    @Id
    private int mobileImeiNo;
    private String mobileModel;
    private String mobileRam;
    private String mobileColour;


}
