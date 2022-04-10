package com.gb.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.gb.booking")
@EntityScan

public class BookingApp {
    public static void main(String[] args) {
        SpringApplication.run(BookingApp.class);
    }
}
