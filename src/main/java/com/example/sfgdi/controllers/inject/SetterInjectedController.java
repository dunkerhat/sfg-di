package com.example.sfgdi.controllers.inject;

import com.example.sfgdi.service.greetings.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public String getGreetings() {
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("setterGreetingServiceImpl")
    public void setGreeting(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
