package com.namouchi.activationfibrebackend.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Gouvernorat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Delegation> delegations;

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

    public List<Delegation> getDelegations() {
        return delegations;
    }

    public void setDelegations(List<Delegation> delegations) {
        this.delegations = delegations;
    }
// Getters and setters
}
