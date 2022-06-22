package com.company;

import java.util.List;

public class Ligne {
    private List<Produit> Produit;
    private int numero;
    private int qte;
    private Produit produit;

    public Ligne(int numero, int qte, Produit produit) {
        this.numero = numero;
        this.qte = qte;
        this.produit = produit;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    public double getPrixTotal() {
         double totalpartiel;
        totalpartiel = numero * qte;
        return  totalpartiel;

    }
}
