package ru.demi.spring.services;

public class HelloServiceRussianImpl implements HelloService {
    @Override
    public String getGreeting() {
        return "здрасте";
    }
}
