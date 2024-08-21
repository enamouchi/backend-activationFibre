package com.namouchi.activationfibrebackend.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Delegation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "gouvernorat_id")
    private Gouvernorat gouvernorat;

    @OneToMany(mappedBy = "delegation", cascade = CascadeType.ALL)
    private List<Localite> localites;

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

    public Gouvernorat getGouvernorat() {
        return gouvernorat;
    }

    public void setGouvernorat(Gouvernorat gouvernorat) {
        this.gouvernorat = gouvernorat;
    }

    public List<Localite> getLocalites() {
        return localites;
    }

    public void setLocalites(List<Localite> localites) {
        this.localites = localites;
    }
}
