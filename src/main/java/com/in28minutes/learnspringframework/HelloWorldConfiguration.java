package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Adress adress){
    @Override
    public String toString(){
        return "name: " + name + ", age: " + age +  ", adress: " + adress;
    }
};

record Adress (String street, String city ){
    @Override
    public String toString(){
        return "street: " + street + ", city: " + city;
    }
};

@Configuration
public class HelloWorldConfiguration {
    // This is a configuration class
    // It is used to configure the beans that we want spring to manage
    // We can define the beans using @Bean annotation
    // We can define the dependencies between the beans
    // We can define the scope of the beans
    // We can define the lifecycle of the beans
    // We can define the initialization and destruction of the beans
    // We can define the profiles of the beans
    // We can define the conditional beans
    // We can define the bean wiring
    // We can define the bean autowiring
    // We can define the bean autodiscovery

    @Bean
    public String name(){
        return "Noah";
    }

    @Bean
    public int age(){
        return 25;
    }

    @Bean
    public Person person(){
        return new Person("Bob", 30, new Adress("999 brown st", "Cali") );
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), adress());
    }

    @Bean
    public Adress adress(){
        return new Adress("123 Main St", "New York");
    }

}