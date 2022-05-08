package com.example.sfgdi.service;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Creating singleton bean !!!");
    }

    public String getScope() {
        return "I'm a singleton bean";
    }
}
