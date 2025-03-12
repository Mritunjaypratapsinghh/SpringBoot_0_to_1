package com.mritunjay.week1Introduction.IntroductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

// @Component // Not needed since we are defining it as a Bean in AppConfig
public class Apple {

    void eatApple() {
        System.out.println("I am eating an apple");
    }

    @PostConstruct  // Called immediately after the bean is created
    void callThisBeforeUsed() {
        System.out.println("Creating the Apple instance before use");
    }

    @PreDestroy  // Called just before the bean is destroyed (won't work for prototype scope)
    void callThisBeforeDestroy() {
        System.out.println("Destroying the Apple bean");
    }
}
