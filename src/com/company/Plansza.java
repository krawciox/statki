package com.company;

public class Plansza {
    int x;
    int y;
    String[][] plansza;

    public Plansza(int wspolrzednaX, int wspolrzednaY) {
        this.x = wspolrzednaX;
        this.y = wspolrzednaY;

        plansza = new String[x][y];

        for (int outer = 0; outer < plansza.length; outer++) {
            for (int inner = 0; inner < plansza[outer].length; inner++) {
                plansza[outer][inner] = "[ ]";
            }
        }
    }

    public boolean czyPuste(int wspolrzednaX, int wspolrzednaY) {
        x = wspolrzednaX;
        y = wspolrzednaY;
        boolean czyPuste;
        if (plansza[x][y].equals("[ ]")) {
            czyPuste = true;
        } else {
            czyPuste = false;
        }
        return czyPuste;
    }

    public void wyswietlPlansze() {
        System.out.println("    A  B  C  D  E  F  G  H  I  J");
        for (int outer = 0; outer < plansza.length; outer++) {
            if (outer < 9){
                System.out.print(" "+String.valueOf(outer+1)+" ");
            } else {
                System.out.print(String.valueOf(outer+1)+" ");
            }
            for (int inner = 0; inner < plansza[outer].length; inner++) {
                System.out.print(plansza[outer][inner]);
            }
            System.out.println();
        }
    }

    public boolean czyPozaZakresem(Statek nowyStatek) {
        int ogranicznikDlugosci = plansza.length - nowyStatek.dlugosc + 1 ;
        int ogranicznikPlanszy = plansza.length - 1;

        if (nowyStatek.orientacja) { //pionowy statek
            if (nowyStatek.dziubX >= ogranicznikDlugosci || nowyStatek.dziubY > ogranicznikPlanszy) {
                return true;
            } else {
                return false;
            }

        } else { //poziomy statek
            if (nowyStatek.dziubX > ogranicznikPlanszy || nowyStatek.dziubY >= ogranicznikDlugosci) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void rysujStatek(Statek nowyStatek) {
        if (nowyStatek.orientacja) { //pionowy statek
            for (int i = 0; i < nowyStatek.dlugosc; i++) {
                plansza[nowyStatek.dziubX][nowyStatek.dziubY] = "[" + String.valueOf(nowyStatek.dlugosc) + "]";
                nowyStatek.dziubX++;
            }
        } else { //poziomy statek
            for (int i = 0; i < nowyStatek.dlugosc; i++) {
                plansza[nowyStatek.dziubX][nowyStatek.dziubY] = "[" + String.valueOf(nowyStatek.dlugosc) + "]";
                nowyStatek.dziubY++;
            }

        }
    }


    public void czyRysowacStatek(Statek nowyStatek){
        if (czyPuste(nowyStatek.dziubX, nowyStatek.dziubY)){
            if (nowyStatek.orientacja){
                for (int i = 0; i < nowyStatek.dlugosc; i++) {
                    czyPuste(nowyStatek.dziubX + i, nowyStatek.dziubY);
                    nowyStatek.dziubX++;

            }


        }


    }
}

