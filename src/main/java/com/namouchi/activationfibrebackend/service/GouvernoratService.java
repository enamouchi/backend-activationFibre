package com.namouchi.activationfibrebackend.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.namouchi.activationfibrebackend.model.Delegation;
import com.namouchi.activationfibrebackend.model.Gouvernorat;
import com.namouchi.activationfibrebackend.repository.DelegationRepository;
import com.namouchi.activationfibrebackend.repository.GouvernoratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public class GouvernoratService {

    @Autowired
    private GouvernoratRepository gouvernoratRepository;

    @Autowired
    private DelegationRepository delegationRepository;

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Load JSON file from resources directory
            Map<String, Object> jsonMap = mapper.readValue(
                    new ClassPathResource("gouvernorats.json").getInputStream(),
                    new TypeReference<Map<String, Object>>() {});

            List<Gouvernorat> gouvernorats = mapper.convertValue(
                    jsonMap.get("gouvernorats"),
                    new TypeReference<List<Gouvernorat>>() {});

            // Save Gouvernorats and Delegations to the database
            for (Gouvernorat gouvernorat : gouvernorats) {
                gouvernoratRepository.save(gouvernorat);
                for (Delegation delegation : gouvernorat.getDelegations()) {
                    delegation.setGouvernorat(gouvernorat);
                    delegationRepository.save(delegation);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Gouvernorat> findAll() {
        return gouvernoratRepository.findAll();
    }
}
