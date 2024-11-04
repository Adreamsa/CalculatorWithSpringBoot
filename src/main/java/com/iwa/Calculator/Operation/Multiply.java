package com.iwa.Calculator.Operation;

import org.springframework.stereotype.Component;

@Component
public class Multiply {
    public double operation(double num1, double num2) {
        return num1 * num2;
    }
}
