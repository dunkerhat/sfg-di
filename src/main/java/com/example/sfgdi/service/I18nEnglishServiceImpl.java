package com.example.sfgdi.service;

import com.example.sfgdi.repositories.EnglishGreetingsRepository;
import com.example.sfgdi.service.greetings.GreetingService;

public class I18nEnglishServiceImpl implements GreetingService {

    private final EnglishGreetingsRepository englishGreetingsRepository;

    public I18nEnglishServiceImpl(EnglishGreetingsRepository englishGreetingsRepository) {
        this.englishGreetingsRepository = englishGreetingsRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
