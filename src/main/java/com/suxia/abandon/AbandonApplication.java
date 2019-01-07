package com.suxia.abandon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AbandonApplication {



    public static void main(String[] args) {

        SpringApplication.run(AbandonApplication.class, args);

    }

}

