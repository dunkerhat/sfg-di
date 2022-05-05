package com.example.sfgdi.service;

import com.example.sfgdi.service.greetings.GreetingService;

public class I18nEnglishServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
