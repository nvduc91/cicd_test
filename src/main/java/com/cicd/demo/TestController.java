package com.cicd.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("{text}")
    public String testFunction(@PathVariable String text) {
        return text;
    }

    private String methodUnused(String input) {
        // TODO just for Sonar catch
        return input;
    }
}
