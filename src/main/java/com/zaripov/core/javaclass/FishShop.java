package com.zaripov.core.javaclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FishShop {

    @Bean(name = "DOLPH")
    public Dolphin dolphin (){
        return new Dolphin();
    }

    @Bean
    public GoldFish goldFish (){
        return new GoldFish();
    }
}
