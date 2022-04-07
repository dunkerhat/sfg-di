package com.example.sfgdi.controller;

import com.example.sfgdi.controller.inject.SetterInjectedController;
import com.example.sfgdi.service.greetings.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreeting(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreetings());
    }
}