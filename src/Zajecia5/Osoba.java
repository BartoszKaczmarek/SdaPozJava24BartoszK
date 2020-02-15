package Zajecia5;

public class Osoba {                       // modyfikatory dostępu: public, private,
    public String imię;                    // obiekt tyou Osoba posiada właściwość - imię
    public String nazwisko;
    public int wiek;
    public double wzrost;
    public double waga;


    // konstruktor bezparametrowy
    public Osoba() {
        System.out.println("Tworzę obiekt typu Osoba...");
    }

     // konstruktor parametrowy - pzeciążąnie - pozwala na określnie pól wymaganych
     // jak pzy zakłądaniu konta; jeśli zefiniujemy jawnie konstruktor parametrowy,
     // to konstruktor bezparametrowy nie jest generowany

    public Osoba(String imię, String nazwisko, int wiek) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.wiek = wiek;    // lub: wiek = w

        // THIS ma odnosić się do pól w klasie - wewnętrzna nazwa ułatwia określenie
        // do czego paramentry sie odnoszą
    }

        // definicja metody do opisu Osoby
        public String przedstawSie(){
            return "Na imię mam " + this.imię + ", nazywam się " + this.nazwisko + " i mam " + this.wiek + " lat.";
        }


}
