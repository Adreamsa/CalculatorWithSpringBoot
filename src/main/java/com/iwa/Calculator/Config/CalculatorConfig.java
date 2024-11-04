package com.iwa.Calculator.Config;

import com.iwa.Calculator.Operation.Sum;
import com.iwa.Calculator.Operation.Minus;
import com.iwa.Calculator.Operation.Multiply;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {

    @Bean
    public Sum sum() {
        return new Sum();
    }

}
