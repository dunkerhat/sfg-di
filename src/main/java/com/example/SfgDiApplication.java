package com.example;

import com.example.sfgdi.controllers.I18nController;
import com.example.sfgdi.controllers.MyController;
import com.example.sfgdi.controllers.inject.ConstructorInjectedController;
import com.example.sfgdi.controllers.inject.PropertyInjectedController;
import com.example.sfgdi.controllers.inject.SetterInjectedController;
import com.example.sfgdi.controllers.PetController;
import com.example.sfgdi.service.PrototypeBean;
import com.example.sfgdi.service.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"cappe.springframework.pets", "com.example.sfgdi"})
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = ctx.getBean(MyController.class);

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

        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getScope());
        SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean2.getScope());

        PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getScope());
        PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.getScope());
    }

}
