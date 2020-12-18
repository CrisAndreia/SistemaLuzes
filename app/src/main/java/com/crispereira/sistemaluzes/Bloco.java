package com.crispereira.sistemaluzes;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Bloco {

    ArrayList<Sala> salas;

    String nome;
    boolean luzAcesa;

    public Bloco(ArrayList<Sala> salas, String nome) {
        this.salas = salas;
        this.nome = nome;
        this.luzAcesa = false;
    }

    public void apagaLampada() {
        this.salas.forEach(Sala::apagarLuz);
    }

    public void acendeLampada() {
        this.salas.forEach(Sala::acenderLuz);
    }

    public boolean getEstadoLuzes() {
        return this.salas.stream().map(Sala::getEstadoLuz).collect(Collectors.toList()).contains(true);
    }

    public static Bloco createBloco(String nome) {
        Sala sala1 = new Sala(501);
        Sala sala2 = new Sala(502);
        Sala sala3 = new Sala(503);

        ArrayList<Sala> salas = new ArrayList<>();
        salas.add(sala1);
        salas.add(sala2);
        salas.add(sala3);

        return new Bloco(salas, nome);
    }
}
