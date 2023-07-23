package com.elenappli.serviceC;

import com.elenappli.libX.NameGetter;
import com.elenappli.libY.NameSayer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-c")
public class ServiceCController {

  @GetMapping("/name")
  public ResponseEntity<String> getName() {
    String id = "c";
    NameSayer.speak(id);
    String name = NameGetter.getServiceName(id);
    return ResponseEntity.ok(name);
  }

  @GetMapping("/something")
  public ResponseEntity<String> getSomething() {
    return ResponseEntity.ok("something");
  }
}
