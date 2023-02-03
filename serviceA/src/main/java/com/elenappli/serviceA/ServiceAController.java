package com.elenappli.serviceA;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-a")
public class ServiceAController {

    @GetMapping("/name")
    public ResponseEntity<String> getName() {
        return ResponseEntity.ok("service-a");
    }
}
