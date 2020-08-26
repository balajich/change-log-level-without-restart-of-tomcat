package org.eduami.spring.restapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/**")
    public String helloWorld() {
        return "Hello World from: " + serverPort;
    }

}
