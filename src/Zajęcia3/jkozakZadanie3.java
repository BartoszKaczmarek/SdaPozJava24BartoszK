package Zajęcia3;
//Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n,
// a następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana liczba.

import java.util.Scanner;

public class jkozakZadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę n: ");
        int n = sc.nextInt();


        // I wersja z potęgą
        for (int i = 0; Math.pow(2, i) <= n; i++) {
            System.out.println(Math.pow(2, i));
        }

        // II wersja z mnożeniem poprzedniej liczby
        // symbol \ jest interpretowany jako dalszy ciąg o do wyświetlenia
        System.out.print("\n2 Rozwiązanie: ");
        for (int i = 1; i <= n; i = i * 2) {
         System.out.print(i + ", ");
        }

    }

}
