package com.iwa.Calculator.Config;

import com.iwa.Calculator.Operation.Divide;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.iwa.Calculator.Operation"})
public class DivideConfig {

    @Bean
    public Divide divide() {
        return new Divide();
    }
}
