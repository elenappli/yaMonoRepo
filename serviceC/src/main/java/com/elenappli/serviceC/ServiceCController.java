package com.elenappli.serviceC;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-c")
public class ServiceCController {

    @GetMapping("/name")
    public ResponseEntity<String> getName() {
        return ResponseEntity.ok("service-c");
    }
}
