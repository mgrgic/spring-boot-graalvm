package de.graalvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class HelloSpring {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpring.class, args);
    }

}
