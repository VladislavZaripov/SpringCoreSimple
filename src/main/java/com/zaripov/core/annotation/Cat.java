package com.zaripov.core.annotation;

import org.springframework.stereotype.Service;

@Service // for logic
public class Cat {

    public void say(){
        System.out.println("MEOW!");
    }
}
