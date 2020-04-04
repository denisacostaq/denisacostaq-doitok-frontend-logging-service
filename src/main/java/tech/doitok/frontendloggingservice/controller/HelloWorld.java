package tech.doitok.frontendloggingservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/hello")
public class HelloWorld {
    @GetMapping("/free")
    public ResponseEntity<?> helloFree() {
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/protected")
    public ResponseEntity<?> helloProtected() {
        return ResponseEntity.ok("Hello Protected World!!");
    }
}
