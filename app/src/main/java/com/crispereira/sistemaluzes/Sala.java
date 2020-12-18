package com.crispereira.sistemaluzes;

public class Sala {
    int numero;

    boolean lampadaAcesa;

    public Sala(int numero) {
        this.numero = numero;
        this.lampadaAcesa = false;
    }

    protected void apagarLuz() {
        this.lampadaAcesa = false;
    }

    protected void acenderLuz() {
        this.lampadaAcesa = true;
    }

    protected boolean getEstadoLuz() {
        return this.lampadaAcesa;
    }

}
