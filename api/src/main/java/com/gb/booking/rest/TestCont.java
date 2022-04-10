package com.gb.booking.rest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@ApiModel(value = "Test")
public class TestCont {

    @GetMapping
    @ApiOperation("Test")
    String test() {
        return "Hello";
    }
}
