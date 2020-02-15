package cwiczenia;

import java.util.Scanner;

public class CWswitch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Jaką masz temeraturę? ");

        int temperature = sc.nextInt();
        switch (temperature) {
            case 35:
                System.out.println("Jesteś osłabiony?");
                break;
            case 36:
                System.out.println("Wszystko w normie!");
                break;
            case 37:
                System.out.println("Jesteś przeziębiony?");
                break;
            case 38:
                System.out.println("Jesteś chory.");
                break;
            }

        }


    }