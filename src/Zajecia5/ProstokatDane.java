package Zajecia5;

import java.util.Scanner;

public class ProstokatDane {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj bok prostokata 1");
        int a = sc.nextInt();
        int b = sc.nextInt();



        System.out.println("Podaj bok prostokata 2");
        a = sc.nextInt();
        b = sc.nextInt();
        Prostokat p1 = new Prostokat(a, b);

        // metoda getter - zwraca wartość pola (nie przyjmuje argumentów)
        // public int getBokA() {
        // return this.bokA;
        // }

        // metoda setter - nie zwraca a ustawia
        // public void setBokA(int bokA) {
        // if (bokA > 0)
        // } else {
        // throw new IlegalArgumentException("Bok musi byc wiekszy od 0!");
        // }





    }
}
