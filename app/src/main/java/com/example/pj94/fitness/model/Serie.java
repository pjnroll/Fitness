package com.example.pj94.fitness.model;

/**
 * Created by Pj94 on 28/11/2017.
 */

public class Serie {
    public int nSerie;
    public int nRip;

    private Serie(int nSerie, int nRip) {
        this.nSerie = nSerie;
        this.nRip = nRip;
    }

    public static Serie get(int nSerie, int nRip) {
        return new Serie(nSerie, nRip);
    }
}
