package de.graalvm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication(proxyBeanMethods = false)
public class HelloSpring implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("STARTING THE APPLICATION");
        SpringApplication.run(HelloSpring.class, args);
        System.out.println("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) {
        System.out.println("EXECUTING : command line runner");
        for (int i = 0; i < args.length; ++i) {
            System.out.println(String.format("args[%s]: %s", i, args[i]));
        }
    }

}
