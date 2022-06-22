package com.company;

import java.util.List;

public abstract class DocumentCommercial {
    private List<Client> Client;
    private long numero;
    public Client client;
    public Detail detail;

    public DocumentCommercial(long numero, Client client, Detail detail) {
        this.numero = numero;
        this.client = client;
        this.detail = detail;
    }

    public DocumentCommercial() {

    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public double  getTotal() {
        double to


    }
    public double getTVA(){


    }


}
