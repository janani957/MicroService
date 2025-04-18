package com.example.serviceB.entity;

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

    @Override
    public String toString() {
        return '{' +
                "\"imeiNo\":" + mobileImeiNo +
                ", \"model\":'" + mobileModel + '\'' +
                ", \"ram\":'" + mobileRam + '\'' +
                ", \"colour\":'" + mobileColour + '\'' +
                '}';
    }
}
