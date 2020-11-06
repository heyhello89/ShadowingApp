package com.moon.shadowing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShadowingApplication {

    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enable", "false");
        System.setProperty("spring.devtools.livereload.enable", "true");
        SpringApplication.run(ShadowingApplication.class, args);
    }

}
