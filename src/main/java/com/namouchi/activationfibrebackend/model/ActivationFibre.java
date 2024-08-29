package com.namouchi.activationfibrebackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "activation_fibre")
public class ActivationFibre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String gouvernorat;
    private String delegation;
    private String localite;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGouvernorat() {
        return gouvernorat;
    }

    public void setGouvernorat(String gouvernorat) {
        this.gouvernorat = gouvernorat;
    }

    public String getDelegation() {
        return delegation;
    }

    public void setDelegation(String delegation) {
        this.delegation = delegation;
    }

    public String getLocalite() {
        return localite;
    }

    public void setLocalite(String localite) {
        this.localite = localite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getCoordonnesGps() {
        return coordonnesGps;
    }

    public void setCoordonnesGps(String coordonnesGps) {
        this.coordonnesGps = coordonnesGps;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumeroContact() {
        return numeroContact;
    }

    public void setNumeroContact(String numeroContact) {
        this.numeroContact = numeroContact;
    }

    public String getEtage() {
        return etage;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }

    public String getNomImmeuble() {
        return nomImmeuble;
    }

    public void setNomImmeuble(String nomImmeuble) {
        this.nomImmeuble = nomImmeuble;
    }

    public String getNumeroAppartement() {
        return numeroAppartement;
    }

    public void setNumeroAppartement(String numeroAppartement) {
        this.numeroAppartement = numeroAppartement;
    }

    public String getTypePieceIdentite() {
        return typePieceIdentite;
    }

    public void setTypePieceIdentite(String typePieceIdentite) {
        this.typePieceIdentite = typePieceIdentite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRne() {
        return rne;
    }

    public void setRne(String rne) {
        this.rne = rne;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getTelephoneFixe() {
        return telephoneFixe;
    }

    public void setTelephoneFixe(String telephoneFixe) {
        this.telephoneFixe = telephoneFixe;
    }

    public String getTypeAbonnement() {
        return typeAbonnement;
    }

    public void setTypeAbonnement(String typeAbonnement) {
        this.typeAbonnement = typeAbonnement;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNumeroMsisdn() {
        return numeroMsisdn;
    }

    public void setNumeroMsisdn(String numeroMsisdn) {
        this.numeroMsisdn = numeroMsisdn;
    }

    public String getOffre() {
        return offre;
    }

    public void setOffre(String offre) {
        this.offre = offre;
    }

    public String getDebit() {
        return debit;
    }

    public void setDebit(String debit) {
        this.debit = debit;
    }

    public String getRepeaterWifi() {
        return repeaterWifi;
    }

    public void setRepeaterWifi(String repeaterWifi) {
        this.repeaterWifi = repeaterWifi;
    }

    public String getOnt() {
        return ont;
    }

    public void setOnt(String ont) {
        this.ont = ont;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getSignatureClient() {
        return signatureClient;
    }

    public void setSignatureClient(String signatureClient) {
        this.signatureClient = signatureClient;
    }

    public String getSignatureAgent() {
        return signatureAgent;
    }

    public void setSignatureAgent(String signatureAgent) {
        this.signatureAgent = signatureAgent;
    }
    // Getters and Setters
    // (Include getters and setters for all fields as shown previously)
}
