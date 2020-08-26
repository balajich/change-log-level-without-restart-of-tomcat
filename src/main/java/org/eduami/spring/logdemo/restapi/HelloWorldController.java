package org.eduami.spring.logdemo.restapi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private Log logger = LogFactory.getLog(HelloWorldController.class);

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/helloWorld")
    public String helloWorld() {
        logger.trace("TRACE Level log message");
        logger.debug("DEBUG Level log message");
        logger.info("INFO Level log message");
        logger.warn("WARN Level log message");
        logger.error("ERROR Level log message");
        return "Hello World logger from: " + serverPort;
    }

}
