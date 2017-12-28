package com.example.pj94.fitness.model;

/**
 * Created by Pj94 on 20/12/2017.
 */

public class Persona {
    public int id;
    public String nome;
    public String cognome;
    public String cf;

    public static int cont = 0;

    public Persona(String nome, String cognome) {
        this(nome, cognome, null);
    }

    public Persona(String nome, String cognome, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;

        id = cont;
        cont++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (id != persona.id) return false;
        if (!nome.equals(persona.nome)) return false;
        return cognome.equals(persona.cognome);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nome.hashCode();
        result = 31 * result + cognome.hashCode();
        return result;
    }

    public String toString() {
        return nome + " " + cognome;

    }
}
