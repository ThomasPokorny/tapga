package com.tapga.core;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TapgaApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(TapgaApplication.class).run(args);
    }
}
