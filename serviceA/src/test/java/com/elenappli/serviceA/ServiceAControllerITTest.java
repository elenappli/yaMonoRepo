package com.elenappli.serviceA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ServiceAControllerITTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void given_restCall_when_getName_then_serviceNameReturned() {
        ResponseEntity<String> response = restTemplate.getForEntity("/service-a/name/", String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo("service-a");
    }

}
