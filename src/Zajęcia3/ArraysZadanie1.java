package Zajęcia3;
// http://www.jkozak.pl/przedmioty/java/zadania3.pdf
// Zadanie pierwsze
import java.util.Scanner;

public class ArraysZadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int size = scanner.nextInt();

        // tworzymy nową tablicę:
        int[] array = new int[size];


        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj " + (i + 1) + "element tablicy: ");
            int liczba = scanner.nextInt();
            array[i] = liczba;
        }

        //wyświetl elementy tablicy
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }

        //wyświetl najniższą wartość tablicy
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            System.out.println("Najmniejsza wartość: " + min);
        }

        // avg
        float suma = 0;
        float avg = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        avg = (float) suma / array.length;
        System.out.println("Srednia to: " + avg);



        }




        // wypełnij w pętli for tablicę


    }