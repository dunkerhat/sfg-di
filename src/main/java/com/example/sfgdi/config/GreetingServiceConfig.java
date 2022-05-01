package com.example.sfgdi.config;

import com.example.sfgdi.service.greetings.ConstructorGreetingServiceImpl;
import com.example.sfgdi.service.greetings.PropertyGreetingServicImpl;
import com.example.sfgdi.service.greetings.SetterGreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class GreetingServiceConfig {

    @Bean
    public ConstructorGreetingServiceImpl constructorGreetingServiceImpl(){
        return new ConstructorGreetingServiceImpl();
    }

    @Bean
    public PropertyGreetingServicImpl propertyGreetingServiceImpl(){
        return new PropertyGreetingServicImpl();
    }

    @Bean
    public SetterGreetingServiceImpl setterGreetingServiceImpl(){
        return new SetterGreetingServiceImpl();
    }
}
