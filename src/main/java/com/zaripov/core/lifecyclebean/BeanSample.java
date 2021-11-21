package com.zaripov.core.lifecyclebean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanSample {

    public void onInited(){
        System.out.println("Bean onInited");
    }

    public void onDestroy(){
        System.out.println("Bean onDestroy");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Bean postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Bean preDestroy");
    }
}