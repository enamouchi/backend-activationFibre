/*package com.namouchi.activationfibrebackend.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Gouvernorat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "gouvernorat", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Delegation> delegations = new HashSet<>();

    // Constructors, getters, and setters
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

    public Set<Delegation> getDelegations() {
        return delegations;
    }

    public void setDelegations(Set<Delegation> delegations) {
        this.delegations = delegations;
    }
}*/
