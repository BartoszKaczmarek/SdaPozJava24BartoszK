package Zadanie7;

public class Pozycja {

        private String nazwaTowaru;
        private int ileSztuk;
        private double cena;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public double ObliczWartosc() {
    return cena * ileSztuk;
    }

    public String toString() {
        return this.nazwaTowaru + " " + cena + "zł" + ileSztuk + "szt" + ObliczWartosc() + "zł";
    }



}


