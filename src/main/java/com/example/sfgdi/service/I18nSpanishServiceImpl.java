package com.example.sfgdi.service;

import com.example.sfgdi.service.greetings.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpanishServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo -ES";
    }
}
