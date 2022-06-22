package com.company;

import java.util.List;

public abstract class Client extends Personne {
    private List<DocumentCommercial> DocumentCommercial;
    private String numero;

    public Client(String numero) {
        super();
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
