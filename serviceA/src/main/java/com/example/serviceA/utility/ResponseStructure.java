package com.example.serviceA.utility;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ResponseStructure {
    int status;
    String message;
}
