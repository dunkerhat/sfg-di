package com.example.sfgdi.service;

import com.example.sfgdi.service.greetings.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
