package com.iwa.Calculator.Config;

import com.iwa.Calculator.Operation.Divide;
import com.iwa.Calculator.Operation.Minus;
import com.iwa.Calculator.Operation.Multiply;
import com.iwa.Calculator.Operation.Sum;
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


