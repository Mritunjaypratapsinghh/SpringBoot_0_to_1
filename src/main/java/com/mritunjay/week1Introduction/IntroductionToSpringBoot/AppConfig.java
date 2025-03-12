package com.mritunjay.week1Introduction.IntroductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration  // Marks this class as a configuration class for Spring
public class AppConfig {

    @Bean  // Declares a Spring bean named 'getApple'
    // @Scope("singleton") // Default scope: a single instance shared across the application
    // @Scope("request")   // Creates a new instance per HTTP request (useful in web apps)
    // @Scope("websocket") // Creates a new instance per WebSocket session
    @Scope("prototype")  // Creates a new instance every time it is requested
    Apple getApple() {
        return new Apple();
    }
}
