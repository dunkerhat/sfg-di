package com.example.sfgdi;

import com.example.sfgdi.controller.*;
import com.example.sfgdi.controller.inject.ConstructorInjectedController;
import com.example.sfgdi.controller.inject.PropertyInjectedController;
import com.example.sfgdi.controller.inject.SetterInjectedController;
import com.example.sfgdi.controller.pet.PetController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = (MyController) ctx.getBean(MyController.class);

        PetController petController = ctx.getBean("petController", PetController.class);
        System.out.println(petController.whichPetIsBest());

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        System.out.println("--------Primary Bean--------");
        System.out.println(myController.sayHello());

        System.out.println("--------Property--------");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreetings());

        System.out.println("--------Setter--------");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreetings());

        System.out.println("--------Constructor--------");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreetings());
    }

}
