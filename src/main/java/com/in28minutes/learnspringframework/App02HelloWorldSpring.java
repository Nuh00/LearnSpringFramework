package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1. Launch the Spring Application
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // 2. Configure the things that we want spring framework to manage - @Configuration
        // name - @Bean

        // 3. Retrieve beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Params"));

        System.out.println(context.getBean((Adress.class)));


    }


}
