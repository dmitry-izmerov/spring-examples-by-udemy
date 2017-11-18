package ru.demi.spring.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ru.demi.spring.services.HelloService;

@Controller
public class HelloCtrl {

    @Autowired
    private HelloService helloService;

    public void sayHello() {
        String greeting = helloService.getGreeting();
        System.out.println(greeting);
    }
}
