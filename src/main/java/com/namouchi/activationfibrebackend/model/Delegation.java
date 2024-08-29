/*package com.namouchi.activationfibrebackend.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Delegation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "gouvernorat_id")
    private Gouvernorat gouvernorat;

    @OneToMany(mappedBy = "delegation", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Localite> localites = new HashSet<>();

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Gouvernorat getGouvernorat() {
        return gouvernorat;
    }

    public void setGouvernorat(Gouvernorat gouvernorat) {
        this.gouvernorat = gouvernorat;
    }

    public Set<Localite> getLocalites() {
        return localites;
    }

    public void setLocalites(Set<Localite> localites) {
        this.localites = localites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}*/
