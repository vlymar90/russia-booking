package com.gb.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.gb.booking")
@EntityScan
@EnableJpaRepositories
public class BookingApp {
    public static void main(String[] args) {
        SpringApplication.run(BookingApp.class);
    }
}
