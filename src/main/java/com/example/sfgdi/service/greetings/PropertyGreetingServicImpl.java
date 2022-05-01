package com.example.sfgdi.service.greetings;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServicImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
