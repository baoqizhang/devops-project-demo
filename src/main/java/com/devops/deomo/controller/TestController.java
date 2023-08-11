package com.devops.deomo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/test")
@RefreshScope
public class TestController {

    @Value("${devops.api.one}")
    private String one;

    @Value("${devops.api.two}")
    private String two;

    @Value("${devops.mount}")
    private String mount;
    @Value("${test}")
    private String test;

    @GetMapping("/one")
    public String getOne() {
        return one;
    }

    @GetMapping("/two")
    public String getTwo() {
        return two;
    }

    @GetMapping("/mount")
    public String getMount() {
        return mount;
    }

    @GetMapping()
    public String getTest() {
        return test;
    }

}
