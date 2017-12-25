package ru.demi.spring.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import ru.demi.spring.services.HelloService;

@Controller
public class HelloCtrl {

    @Autowired
    private HelloService helloService;

    @Autowired
    @Qualifier("helloServiceGerman")
    private HelloService helloServiceGerman;

    @Autowired
    @Qualifier("italian")
    private HelloService helloServiceItalian;

    public void sayHello() {
        String greeting = helloService.getGreeting();
        System.out.println(greeting);
        System.out.println(helloServiceGerman.getGreeting());
        System.out.println(helloServiceItalian.getGreeting());
    }
}
