package com.namouchi.activationfibrebackend.model;

import jakarta.persistence.*;

@Entity
public class ActivationFibre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "gouvernorat_id")
    private Gouvernorat gouvernorat;

    @ManyToOne
    @JoinColumn(name = "delegation_id")
    private Delegation delegation;

    private String adresse;
    private String codePostal;
    private String coordonnesGps;
    private String nom;
    private String numeroContact;
    private String etage;
    private String nomImmeuble;
    private String numeroAppartement;
    private String typePieceIdentite;
    private String email;
    private String rne;
    private String civilite;
    private String telephoneFixe;
    private String typeAbonnement;
    private String dateNaissance;
    private String numeroMsisdn;
    private String offre;
    private String debit;
    private String repeaterWifi;
    private String ont;
    private String sn;

    @Lob
    private String signatureClient;

    @Lob
    private String signatureAgent;

    // Getters and Setters
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

    public Delegation getDelegation() {
        return delegation;
    }

    public void setDelegation(Delegation delegation) {
        this.delegation = delegation;
    }

    // Other getters and setters
}
