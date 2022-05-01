package com.example.sfgdi.controllers;

import com.example.sfgdi.controllers.inject.PropertyInjectedController;
import com.example.sfgdi.service.greetings.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new ConstructorGreetingServiceImpl();
    }

    @Test
    void getGreetings() {
        System.out.println(propertyInjectedController.getGreetings());
    }
}