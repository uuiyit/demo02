package com.example.demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:xmlproperties.xml")
public class Demo02Application {
        public static void main(String[] args) {
              SpringApplication.run(Demo02Application.class, args);

        }
}
