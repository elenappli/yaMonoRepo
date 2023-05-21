package com.elenappli.serviceA;

import com.elenappli.libX.NameGetter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-a")
public class ServiceAController {
    private final static String HELP_MESSAGE = "This is serviceA that does nothing";

    @GetMapping("/name")
    public ResponseEntity<String> getName() {
        String name = NameGetter.getServiceName("a");
        return ResponseEntity.ok(name);
    }

    @GetMapping("/help")
    public ResponseEntity<String> getHelp() {
        return ResponseEntity.ok(HELP_MESSAGE);
    }
}
