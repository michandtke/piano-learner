package de.mwa.pianolearner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class PianoLearnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PianoLearnerApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctxt) {
        return args -> {
            System.out.println("Let's inspect the beans provided by Spring Boot:");

//            String[] beanNames = ctxt.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
        };
    }

}
