package com.company;

import java.util.List;

public class Categorie {

    private String designation;
    private  String description;

    public Categorie(String designation, String description) {
        this.designation = designation;
        this.description = description;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

