package Zajecia5;

public class WstępDoObiektow {
    // pierwsze przykłady tworzenia obiektów

    public static void main(String[] args) {

        //"student" jest obiektem typu Osoba
        // new Osoba(); ----> wywołanie konstruktora bezparametrowego klasy Osoba
        Osoba student = new Osoba();
        student.imię = "Piotr";
        student.nazwisko = "Kowalski";
        student.waga = 70;
        student.wiek = 30;
        student.wzrost = 1.80;

        // "uczen" jest obiektem typu Osoba
        Osoba uczen = new Osoba();
        uczen.imię = "Maciej";
        uczen.nazwisko = "Krawczyk";
        uczen.wiek = 15;

        // odczyt pola
        String a = student.imię;
        System.out.println("Imię studenta: " + a);

        // szybszy,peferowany sposób
        System.out.println("Nazwisko studenta: " + student.nazwisko);

        // wartości drugiego obiektu
        System.out.println(uczen.imię);
        System.out.println(uczen.nazwisko);
        System.out.println(uczen.imię);


        // zmiana nazwiska studenta
        System.out.println("Po zmianie nazwiska: ");
        student.nazwisko = "aaaaaa";
        System.out.println(student.nazwisko);
        System.out.println(uczen.nazwisko);

        // obiekt z użyciem konstruktora parametrowego
        Osoba praciwnik = new Osoba("Anna", "Adamiak", 28);
        System.out.println(praciwnik.imię);
        System.out.println(praciwnik.nazwisko);
        System.out.println(praciwnik.wiek);
        System.out.println(praciwnik.waga);


        // Wywyłujemy metodę "przedstaw się"
        System.out.println(student.przedstawSie());
        System.out.println(uczen.przedstawSie());
        System.out.println(praciwnik.przedstawSie());
    }

}
