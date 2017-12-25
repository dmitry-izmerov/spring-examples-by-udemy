package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import ru.demi.spring.ctrls.HelloCtrl;

@SpringBootApplication
@ComponentScan("ru.demi.spring")
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		HelloCtrl helloCtrl = (HelloCtrl) ctx.getBean("helloCtrl");
		helloCtrl.sayHello();
	}
}
