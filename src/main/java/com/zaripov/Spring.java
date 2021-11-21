package com.zaripov;

import com.zaripov.core.lifecyclebean.BeanSample;
import com.zaripov.core.xml.CarShop;
import com.zaripov.core.javaclass.Dolphin;
import com.zaripov.core.javaclass.FishShop;
import com.zaripov.core.javaclass.GoldFish;
import com.zaripov.core.lifecyclebean.BeanFactory;
import com.zaripov.core.annotation.PetShop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.zaripov")
public class Spring {

    public static void main(String[] args) {
        Core core = new Core();
        core.xml();
        core.javaClass();
        core.annotation();
        core.lifeCycle();
    }

}

class Core {

    public void xml(){
        System.out.println("\n" + "Core: xml");

        ApplicationContext context = new ClassPathXmlApplicationContext("service.xml");
        CarShop carShop = context.getBean("shop",CarShop.class);
        carShop.lada.say();
        carShop.bugati.say();
    }

    public void javaClass(){
        System.out.println("\n" + "Core: javaClass");

        ApplicationContext context = new AnnotationConfigApplicationContext(FishShop.class);
        GoldFish goldFish = context.getBean("goldFish",GoldFish.class);
        goldFish.say();
        Dolphin dolphin = context.getBean("DOLPH",Dolphin.class);
        dolphin.say();
    }

    public void annotation(){
        System.out.println("\n" + "Core: annotation");

        ApplicationContext context = new AnnotationConfigApplicationContext(PetShop.class);
        PetShop petShop = context.getBean(PetShop.class);
        petShop.cat.say();
        petShop.dog.say();
    }

    public void lifeCycle(){
        System.out.println("\n" + "Core: lifeCycle");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanFactory.class);
        System.out.println("Hi lifeCycle");

        BeanSample beanSample1 = context.getBean("bean", BeanSample.class);
        BeanSample beanSample2 = context.getBean("bean", BeanSample.class);
        System.out.println(beanSample1.equals(beanSample2));

        ((AnnotationConfigApplicationContext)context).close();

        for (String s : context.getBeanDefinitionNames()){System.out.println(s);}
    }

}