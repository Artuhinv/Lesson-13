package com.example.Main;

import org.springframework.stereotype.Component;
@Component
public interface Operation {
    double getResult(double a, double b);
}
