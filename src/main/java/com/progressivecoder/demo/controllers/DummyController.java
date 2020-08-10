package com.progressivecoder.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class DummyController {

    @GetMapping(value = "/unknown")
    public ResponseEntity<String> getUnknownUser() {
        return ResponseEntity.ok("Hello Unknown User");
    }

    @RolesAllowed("user")
    @GetMapping(value = "/normal-user")
    public ResponseEntity<String> getNormalUser() {
        return ResponseEntity.ok("Hello Normal User");
    }

    @RolesAllowed("admin")
    @GetMapping(value = "/admin-user")
    public ResponseEntity<String> getAdminUser() {
        return ResponseEntity.ok("Hello Admin User");
    }

}
