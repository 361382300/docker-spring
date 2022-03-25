package com.csair.oms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringApplication.class,args);
        System.out.println("Monitor Started");
    }

}
