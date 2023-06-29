package com.example.springbootwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringbootwebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootwebserviceApplication.class, args);
    }

}
