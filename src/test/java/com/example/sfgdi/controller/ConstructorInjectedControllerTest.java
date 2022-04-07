package com.example.sfgdi.controller;

import com.example.sfgdi.controller.inject.ConstructorInjectedController;
import com.example.sfgdi.service.greetings.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreetings());
    }
}