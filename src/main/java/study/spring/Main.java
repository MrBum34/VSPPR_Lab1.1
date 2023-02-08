package study.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;
import study.spring.service.HelloService;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx=SpringApplication.run(Main.class,args);
        HelloService s= ctx.getBean(HelloService.class);
        s.prn();
    }

}
