package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@SpringBootApplication
@RestController
public class DemoApp {

    @GetMapping ("/get")
    public String getMessage() {
        return "the server started";
    }
    public static void main(String[] args) {

        SpringApplication.run(DemoApp.class, args);
    }
}