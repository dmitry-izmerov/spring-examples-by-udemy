package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import ru.demi.spring.ctrls.HelloCtrl;

@SpringBootApplication
//@ComponentScan("ru.demi.spring")
@ImportResource("classpath:spring-config.xml")
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		HelloCtrl helloCtrl = (HelloCtrl) ctx.getBean("helloCtrl");
		helloCtrl.sayHello();
	}
}
