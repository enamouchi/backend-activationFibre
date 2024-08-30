package com.namouchi.activationfibrebackend.controller;

import com.namouchi.activationfibrebackend.model.ActivationFibre;
import com.namouchi.activationfibrebackend.service.ActivationFibreService;
import com.namouchi.activationfibrebackend.service.JsonDataReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ActivationFibreController {

    @Autowired
    private ActivationFibreService activationFibreService;

    @Autowired
    private JsonDataReader jsonDataReader;

    @PostMapping("/step1")
    public ResponseEntity<ActivationFibre> saveStep1(@RequestBody ActivationFibre activationFibre) {
        ActivationFibre savedEntity = activationFibreService.saveStep1(activationFibre);
        return ResponseEntity.ok(savedEntity);
    }

    @PostMapping("/step2")
    public ResponseEntity<ActivationFibre> saveStep2(@RequestParam Long id, @RequestParam String signatureClient, @RequestParam String signatureAgent) {
        String base64SignatureClient = signatureClient.isEmpty() ? "" : Base64.getEncoder().encodeToString(signatureClient.getBytes());
        String base64SignatureAgent = signatureAgent.isEmpty() ? "" : Base64.getEncoder().encodeToString(signatureAgent.getBytes());

        ActivationFibre updatedEntity = activationFibreService.saveStep2(id, base64SignatureClient, base64SignatureAgent);
        return ResponseEntity.ok(updatedEntity);
    }

    @GetMapping("/gouvernorats")
    public ResponseEntity<?> getGouvernorats() {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("gouvernorats.json")) {
            if (inputStream == null) {
                return ResponseEntity.status(404).body("JSON file not found in resources.");
            }
            Map<String, Object> gouvernoratsData = jsonDataReader.readData(inputStream);
            return ResponseEntity.ok(gouvernoratsData);
        } catch (IOException e) {
            return ResponseEntity.status(500).body("Error reading JSON file: " + e.getMessage());
        }
    }
}
