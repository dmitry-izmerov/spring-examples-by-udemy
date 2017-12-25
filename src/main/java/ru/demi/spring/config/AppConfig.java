package ru.demi.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import ru.demi.spring.services.HelloService;
import ru.demi.spring.services.HelloServiceEnglishImpl;
import ru.demi.spring.services.HelloServiceRussianImpl;

@Configuration
public class AppConfig {

    @Bean
    @Profile("english")
    public HelloService helloServiceEnglish() {
        return new HelloServiceEnglishImpl();
    }

    @Bean
    @Profile({"default", "russian"})
    public HelloService helloServiceRussian() {
        return new HelloServiceRussianImpl();
    }
}
