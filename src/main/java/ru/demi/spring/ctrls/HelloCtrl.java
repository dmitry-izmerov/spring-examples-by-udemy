package ru.demi.spring.ctrls;

import ru.demi.spring.services.HelloService;

public class HelloCtrl {

    private HelloService helloService;

    private HelloService helloServiceGerman;

    private HelloService helloServiceItalian;

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public void setHelloServiceGerman(HelloService helloServiceGerman) {
        this.helloServiceGerman = helloServiceGerman;
    }

    public void setHelloServiceItalian(HelloService helloServiceItalian) {
        this.helloServiceItalian = helloServiceItalian;
    }

    public void sayHello() {
        String greeting = helloService.getGreeting();
        System.out.println(greeting);
        System.out.println(helloServiceGerman.getGreeting());
        System.out.println(helloServiceItalian.getGreeting());
    }
}
