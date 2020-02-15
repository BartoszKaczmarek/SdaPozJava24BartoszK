import java.util.Random;

public class tablica2D {
    public static void main(String[] args) {
        int[][] macierz = new int[3][4]; // macierz 3 x 4

        System.out.println(macierz.length); // długość jednej płaszczyzny - liczbe wierszy
        System.out.println(macierz[0].length); // zwraca liczbę kolumn

        //losowe wypełnianie
        Random random = new Random();
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                macierz[i][j] = random.nextInt(10);
            }
        }


        // wystwietlanie macierzy
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                System.out.print(macierz[i][j] + " , ");
            }
            System.out.println();
        }

        int[] maxWWierszach = new int[macierz.length];
        for (int i = 0; i < macierz.length; i++) {
            int max = macierz[i][0];
            for (int j = 0; j < macierz[0].length; j++) {
                if (max < macierz[i][j]) {
                    max = macierz[i][j];
                }
            }
            maxWWierszach[i] = max;
        }



        // wartość maksymalna
        System.out.println("Maksymalne wartości w wierszu: ");
        for (int wWierszach : maxWWierszach) {
            System.out.print(wWierszach + ", ");
        }


    }

}




