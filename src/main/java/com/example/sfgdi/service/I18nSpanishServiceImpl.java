package com.example.sfgdi.service;

import com.example.sfgdi.service.greetings.GreetingService;

public class I18nSpanishServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo -ES";
    }
}
