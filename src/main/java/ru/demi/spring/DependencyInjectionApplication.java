package ru.demi.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ru.demi.spring.ctrls.HelloCtrl;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		HelloCtrl helloCtrl = (HelloCtrl) ctx.getBean("helloCtrl");
		helloCtrl.sayHello();
	}
}
