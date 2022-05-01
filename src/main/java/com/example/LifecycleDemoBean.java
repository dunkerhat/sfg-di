package com.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifecycleDemoBean implements
        InitializingBean, DisposableBean,
        ApplicationContextAware,
        BeanNameAware, BeanFactoryAware {

    public LifecycleDemoBean() {
        System.out.println("## I'm the LifecyleDemoBean constructor");
    }

    @PostConstruct
    public void beforeInit() {
        System.out.println("-- Before Init -- Method call by bean post processor");
    }

    @PreDestroy
    public void afterInit() {
        System.out.println("-- After Init -- Method call by bean post processor");
    }

    @Override //InitializeBean
    public void afterPropertiesSet() throws Exception {
        System.out.println("## LifecycleBeanDemo has its properties set!");
    }

    @Override //DisposableBean
    public void destroy() throws Exception {
        System.out.println("## LifecycleBeanDemo has been terminated");
    }

    @Override //ApplicationContextAware
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");
    }

    @Override //BeanNameAware
    public void setBeanName(String name) {
        System.out.println("## My name is " + name);
    }

    @Override //BeanFactoryAware
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean factory has been set");
    }
}
