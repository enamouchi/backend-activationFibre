package com.namouchi.activationfibrebackend.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.namouchi.activationfibrebackend.model.Gouvernorat;
import com.namouchi.activationfibrebackend.repository.GouvernoratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class GouvernoratDataLoader {

    @Autowired
    private GouvernoratRepository gouvernoratRepository;

    @PostConstruct
    public void loadGouvernoratData() {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Gouvernorat>> typeReference = new TypeReference<>(){};
        InputStream inputStream = getClass().getResourceAsStream("/gouvernorats.json");

        try {
            List<Gouvernorat> gouvernorats = objectMapper.readValue(inputStream, typeReference);
            gouvernoratRepository.saveAll(gouvernorats);
            System.out.println("Gouvernorats data loaded successfully!");
        } catch (IOException e) {
            System.out.println("Unable to load gouvernorats data: " + e.getMessage());
        }
    }
}
