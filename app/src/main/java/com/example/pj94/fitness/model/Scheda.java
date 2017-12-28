package com.example.pj94.fitness.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pj94 on 28/11/2017.
 */

public class Scheda {
    public int id;
    public Persona proprietario;
    public Map<Esercizio, Serie> scheda;
    public String titolo;
    public String desc;

    public static int cont = 0;

    public Scheda(Persona proprietario) {
        this(proprietario, null, null, null);
    }

    public Scheda(Persona proprietario, HashMap<Esercizio, Serie> scheda, String titolo, String desc) {
        id = cont;
        this.proprietario = proprietario;
        this.scheda = new HashMap<>(scheda);
        this.titolo = titolo;
        this.desc = desc;

        cont++;
    }

    public void setScheda(HashMap<Esercizio, Serie> scheda) {
        this.scheda = scheda;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Scheda n. ").append(id).append("\n");
        s.append("Proprietario: ").append(proprietario).append("\n");
        for (Esercizio e : scheda.keySet()) {
            s.append(e.toString()).append(scheda.get(e).nSerie).append("x").append(scheda.get(e).nRip);
        }

        return s.toString();
    }

}
