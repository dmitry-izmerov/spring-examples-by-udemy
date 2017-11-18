package ru.demi.spring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("english")
public class HelloServiceEnglishImpl implements HelloService {
    @Override
    public String getGreeting() {
        return "hello there";
    }
}
