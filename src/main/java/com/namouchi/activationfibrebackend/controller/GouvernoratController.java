package com.namouchi.activationfibrebackend.controller;

import com.namouchi.activationfibrebackend.model.Gouvernorat;
import com.namouchi.activationfibrebackend.service.GouvernoratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gouvernorats/")
public class GouvernoratController {
    private final GouvernoratService gouvernoratService;

    @Autowired
    public GouvernoratController(GouvernoratService gouvernoratService) {
        this.gouvernoratService = gouvernoratService;
    }

    @GetMapping
    public List<Gouvernorat> getGouvernorats() {
        return gouvernoratService.getGouvernorats();
    }
}
