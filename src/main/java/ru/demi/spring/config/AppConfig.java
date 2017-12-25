package ru.demi.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import ru.demi.spring.services.HelloService;
import ru.demi.spring.services.HelloServiceFactory;
import ru.demi.spring.services.HelloServiceFactory.LANG;

@Configuration
public class AppConfig {

    @Bean
    public HelloServiceFactory helloServiceFactory() {
        return new HelloServiceFactory();
    }

    @Bean
    @Profile("english")
    public HelloService helloServiceEnglish(HelloServiceFactory helloServiceFactory) {
        return helloServiceFactory.createHelloService(LANG.EN);
    }

    @Bean
    @Profile({"default", "russian"})
    @Primary
    public HelloService helloServiceRussian(HelloServiceFactory helloServiceFactory) {
        return helloServiceFactory.createHelloService(LANG.RU);
    }

    @Bean
    public HelloService helloServiceGerman(HelloServiceFactory helloServiceFactory) {
        return helloServiceFactory.createHelloService(LANG.GE);
    }

    @Bean(name = "italian")
    public HelloService helloServiceItalian(HelloServiceFactory helloServiceFactory) {
        return helloServiceFactory.createHelloService(LANG.IT);
    }

    @Bean
    public HelloService helloServiceSpanish(HelloServiceFactory helloServiceFactory) {
        return helloServiceFactory.createHelloService(LANG.SP);
    }
}
