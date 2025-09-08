package com.bitsnbytes.product;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    @Bean
    public MyComponent MyComponent(){
        return new MyComponent();
    }
}
