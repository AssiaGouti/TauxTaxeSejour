package com.example.taxe_sejour.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class Locale {

    @Id @GeneratedValue

    private Long id;
    private String reference;
    private String libelle;
    private String rue;
    private String complementAdresse;

    public Locale(Long id, String reference, String libelle, String rue, String complementAdresse) {
        this.id = id;
        this.reference = reference;
        this.libelle = libelle;
        this.rue = rue;
        this.complementAdresse = complementAdresse;
    }

    public Locale() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getComplementAdresse() {
        return complementAdresse;
    }

    public void setComplementAdresse(String complementAdresse) {
        this.complementAdresse = complementAdresse;
    }


}
