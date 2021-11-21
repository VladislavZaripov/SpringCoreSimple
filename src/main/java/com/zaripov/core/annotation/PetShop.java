package com.zaripov.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( basePackages = {"com.zaripov.core.annotation"})
public class PetShop {



    public Cat cat;
    public Dog dog;

    /*  with constructor */

//    public PetShop(Cat cat, Dog dog) {
//        this.cat = cat;
//        this.dog = dog;
//    }

    /* with annotation */

    @Autowired
    public void setCat(Cat cat) {
        this.cat = cat;
    }
    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
