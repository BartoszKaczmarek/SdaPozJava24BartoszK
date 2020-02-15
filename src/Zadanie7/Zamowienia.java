package Zadanie7;

public class Zamowienia {
    private final static int DOMYSLNY_ROZMIAR_ZAMOWIENIA = 10;
    private Pozycja[] pozycje;
    private int ileDodanych;
    private int maxRozmiar;

    // konstruktor bezparametrowy moze służyć do ustawiania wartości domyślnych
    public Zamowienia() {
        this.maxRozmiar = 10;
        pozycje = new Pozycja[maxRozmiar];

         // alternatywnie z odwołaniem do domyślnego rozmiaru zamówienia
        // public Zamowienia() {
        // this (DOMYSLNY_ROZMIAR_ZAMOWIENIA);
        // }
    }

    public Zamowienia(int maxRozmiar) {
        this.maxRozmiar = maxRozmiar;
        pozycje = new Pozycja[maxRozmiar];
    }

    public void dodajPozycje(Pozycja poz) {
        if (this.ileDodanych >= maxRozmiar) {
            System.out.println("Nie można dodać - osiągięto max rozmiar");
        } else {
            this.pozycje[ileDodanych] = poz;
            ileDodanych++;
        }
    }

    public double obliczWartosc() {
        double wartoscZamowienia = 0;
        for (Pozycja p : pozycje) {
            if (p != null) {                  // konieczny warunek bo wedruje przez całą tabelę 10 pozycji
                wartoscZamowienia += p.ObliczWartosc();
            }
        }
            return wartoscZamowienia;
        }
        public String toString(){
            String result = "Zamówienie: ";
            for (int i = 1; i < ileDodanych; i++) {
                result += pozycje[i].toString() + "\n";
            }
            return result;
        }


}
