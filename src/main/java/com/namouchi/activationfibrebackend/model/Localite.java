/*package com.namouchi.activationfibrebackend.model;

import jakarta.persistence.*;

@Entity
public class Localite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "delegation_id")
    private Delegation delegation;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Delegation getDelegation() {
        return delegation;
    }

    public void setDelegation(Delegation delegation) {
        this.delegation = delegation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
*/
