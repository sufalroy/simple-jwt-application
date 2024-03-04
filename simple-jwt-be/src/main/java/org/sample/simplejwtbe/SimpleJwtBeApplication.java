package org.sample.simplejwtbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity
public class SimpleJwtBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleJwtBeApplication.class, args);
    }

}
