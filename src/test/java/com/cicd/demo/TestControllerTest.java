package com.cicd.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage(){
        Assertions.assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/Hello, World",
                String.class)).contains("Hello, World");
    }

    @Test
    public void greetingShouldReturnFalse(){
        Assertions.assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/Hello, World",
                String.class)).contains("Hello, World1");
    }
}
