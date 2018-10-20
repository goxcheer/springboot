package com.qgx.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class App1 {

    public static void main(String[] args) {
        SpringApplication.run(App1.class, args);
    }
}
