package de.mwa.pianolearner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContainer {

    @GetMapping("/kontor")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
