package com.zaripov.core.lifecyclebean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactory {

    @Bean(initMethod = "onInited",destroyMethod = "onDestroy")
    public BeanSample bean() {
        return new BeanSample();
    }
}
