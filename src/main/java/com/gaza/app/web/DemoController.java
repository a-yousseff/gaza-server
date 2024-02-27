package com.gaza.app.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class DemoController {

    @RequestMapping
    @CrossOrigin(origins = "*")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("2");
    }
}
