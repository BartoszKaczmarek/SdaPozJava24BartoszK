package zajecia1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        //strumień wejściowy:
        Scanner czytnik = new Scanner(System.in);

        double masa;
        double wzrost;

        System.out.println("Jaka jest masa ciała: ");
        masa = czytnik.nextInt();

        System.out.println("Jaki jest wzrost: ");
        wzrost = czytnik.nextDouble();

        double bmi = masa / (wzrost * wzrost);
        System.out.println(" Twoje BMI to: " + bmi);
        // alternatywnie: masa / Math.pow(wzrost, 2) - do potęgi

        if (bmi < 18.5) {
            System.out.println("Waga zbyt niska");
        } else if (bmi < 25) {
            System.out.println("Prawidłowa masa ciała");
        } else if (bmi < 30) {
            System.out.println("Zbyt wysoka masa ciała");
        } else {
            System.out.println("Otyłość");
        }

    }
}