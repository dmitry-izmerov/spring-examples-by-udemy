package ru.demi.spring.services;

public class HelloServiceEnglishImpl implements HelloService {
    @Override
    public String getGreeting() {
        return "hello there";
    }
}
