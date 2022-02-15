package com.company;

import java.util.Random;

public class Statek {
    int dlugosc;
    boolean orientacja; // true = pionowy, false = poziomy
    int dziubX;
    int dziubY;

    public Statek(int dlugoscStatku, boolean czyPionowy, int xStatku, int yStatku){
        this.dlugosc = dlugoscStatku;
        this.orientacja = czyPionowy;
        this.dziubY = xStatku;
        this.dziubX = yStatku;
    }

    public int[] losujDziub(){
        int[] wylosowanyDziub = new int[2];
        wylosowanyDziub[0] = (int)(Math.random() * 10);
        wylosowanyDziub[1] = (int)(Math.random() * 10);
        return wylosowanyDziub;
    }

    public boolean losujOrientacje(){
        Random random = new Random();
        return random.nextBoolean();
    }
}
