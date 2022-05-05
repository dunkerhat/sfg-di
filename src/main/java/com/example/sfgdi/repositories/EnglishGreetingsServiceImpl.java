package com.example.sfgdi.repositories;

public class EnglishGreetingsServiceImpl implements EnglishGreetingsRepository{
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
