package ru.demi.spring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ru.demi.spring.services.HelloService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
    "classpath:hello-app-config.xml",
    "classpath:english-hello-config.xml"
})

public class EnglishIntegrationTest {

    @Autowired()
    HelloService helloService;

    @Test
    public void shouldReturnHelloWorld() {
        String expected = "hello there";

        assertEquals(expected, helloService.getGreeting());
    }
}
