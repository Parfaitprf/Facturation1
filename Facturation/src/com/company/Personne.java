package com.company;

public abstract class Personne {
    private String nom;
    private String Prenom;
    private Adresse adreese;

    public Personne(String nom, String prenom, Adresse adreese) {
        this.nom = nom;
        Prenom = prenom;
        this.adreese = adreese;
    }

    public Personne() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public Adresse getAdreese() {
        return adreese;
    }

    public void setAdreese(Adresse adreese) {
        this.adreese = adreese;
    }
    public class Adresse {
        private String adresse;
        private String numero;
        private String cellule;
        private String quartier;
        private String commune;
        private String ville;
        private String pays;

    }

