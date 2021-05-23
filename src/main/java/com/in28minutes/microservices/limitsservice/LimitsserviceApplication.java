package com.in28minutes.microservices.limitsservice;

import com.in28minutes.microservices.limitsservice.configuration.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(Configuration.class)
@SpringBootApplication
public class LimitsserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LimitsserviceApplication.class, args);
    }

}
