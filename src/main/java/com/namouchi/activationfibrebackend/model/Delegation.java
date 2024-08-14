package com.namouchi.activationfibrebackend.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Delegation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ElementCollection
    private List<String> localites;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLocalites() {
        return localites;
    }

    public void setLocalites(List<String> localites) {
        this.localites = localites;
    }
// Getters and setters
}
