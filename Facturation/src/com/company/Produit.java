package com.company;

import java.util.Date;
import java.util.List;

public class Produit <T> {
    private List<Categorie> Categorie;
    private String code;
    private String designation;
    private double prix;
    private T uniteMesure;
    private Date dateExpiration;

    public Produit(String code, String designation, double prix, T uniteMesure, Date dateExpiration) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
        this.uniteMesure = uniteMesure;
        this.dateExpiration = dateExpiration;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public T getUniteMesure() {
        return uniteMesure;
    }

    public void setUniteMesure(T uniteMesure) {
        this.uniteMesure = uniteMesure;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;

    }

    }
