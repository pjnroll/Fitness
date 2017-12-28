package com.example.pj94.fitness.model;

import android.widget.ImageView;

/**
 * Created by Pier Luigi Laviano on 28/11/2017.
 */

public class Esercizio {
    public ImageView img;
    public String muscolo;
    public String desc;

    public Esercizio(String muscolo, String desc) {
        this.muscolo = muscolo;
        this.desc = desc;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public String toString() {
        return desc + " (" + muscolo + ")";
    }
}
