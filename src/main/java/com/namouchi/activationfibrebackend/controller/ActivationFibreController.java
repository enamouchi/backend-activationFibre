package com.namouchi.activationfibrebackend.controller;

import com.namouchi.activationfibrebackend.model.ActivationFibre;
import com.namouchi.activationfibrebackend.service.ActivationFibreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ActivationFibreController {

    @Autowired
    private ActivationFibreService activationFibreService;

    @GetMapping("/gouvernorats")
    public ResponseEntity<String> getGouvernorats() {
        return getJsonFile("gouvernorats.json");
    }

    @GetMapping("/delegations")
    public ResponseEntity<String> getDelegations() {
        return getJsonFile("delegations.json");
    }

    @GetMapping("/localites")
    public ResponseEntity<String> getLocalites() {
        return getJsonFile("localites.json");
    }

    private ResponseEntity<String> getJsonFile(String filename) {
        try {
            ClassPathResource jsonFile = new ClassPathResource(filename);
            String json = StreamUtils.copyToString(jsonFile.getInputStream(), StandardCharsets.UTF_8);
            return new ResponseEntity<>(json, HttpStatus.OK);
        } catch (IOException e) {
            return new ResponseEntity<>("Failed to load JSON file", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/activation-fibre")
    public ResponseEntity<String> activateFibre(@RequestBody ActivationFibre request) {
        ActivationFibre saved = activationFibreService.save(request);
        if (saved != null) {
            return new ResponseEntity<>("Form submitted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Form submission failed", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
