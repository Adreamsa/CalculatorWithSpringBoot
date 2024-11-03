package com.iwa.Calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CalculatorConfig {

        @Bean
        public Sum sum() {
            return new Sum();
        }

        @Bean
        public Minus minus() {
            return new Minus();
        }

        @Bean
        public Multiply multiply() {
            return new Multiply();
        }

        @Bean
        public Divide divide() {
            return new Divide();
        }
    }


