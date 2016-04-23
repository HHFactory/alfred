package com.hhfactory.alfred;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"classpath:config/Application.properties"})
public class Application {

	public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
