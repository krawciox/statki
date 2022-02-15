package com.company;

public class Main {

    public static void main(String[] args) {
        Plansza plansza1 = new Plansza(10,10);

        Statek statek1 = new Statek(5,true,0,0);

        System.out.println("poza zakresem: "+plansza1.czyPozaZakresem(statek1));



        plansza1.rysujStatek(statek1);

        plansza1.wyswietlPlansze();






    }
}
