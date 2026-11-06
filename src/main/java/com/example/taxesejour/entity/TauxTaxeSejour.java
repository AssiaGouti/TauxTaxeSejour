package com.example.taxesejour.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



@Entity
public class TauxTaxeSejour {

    @Id
    @GeneratedValue
    private Long id;
    private String reference;
    private String libelle;
    private String categorieTerrain;



    public String getReference(){
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

    public String getCategorieTerrain() {
        return categorieTerrain;
    }

    public void setCategorieTerrain(String categorieTerrain) {
        this.categorieTerrain = categorieTerrain;
    }
}