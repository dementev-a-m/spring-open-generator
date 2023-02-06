package ru.dementev.springopengenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringOpenGeneratorApplication  {

    public static void main(String[] args) {
        SpringApplication.run(SpringOpenGeneratorApplication.class, args);
    }


}
