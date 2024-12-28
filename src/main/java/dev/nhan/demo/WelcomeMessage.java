package dev.nhan.demo;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    public String printWelcomeMessage() {
        return "Welcome to the Spring Boot Application!";
    }
}
