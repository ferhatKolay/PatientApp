package com.kly.hpspitalspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@SpringBootApplication
public class HpspitalSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HpspitalSpringBootApplication.class, args);
    }

    @GetMapping("")
    public String selam(){
        return "Selammm";
    }
}
