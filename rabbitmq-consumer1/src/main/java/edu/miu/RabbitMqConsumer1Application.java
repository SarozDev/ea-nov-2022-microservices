package edu.miu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqConsumer1Application {
    public static void main(String[] args) {
        SpringApplication.run(RabbitMqConsumer1Application.class,args);
        System.out.println("Hello world!");
    }
}