package ru.demi.spring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "russian"})
public class HelloServiceRussianImpl implements HelloService {
    @Override
    public String getGreeting() {
        return "здрасте";
    }
}
