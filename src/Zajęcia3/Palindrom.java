package Zajęcia3;


//http://www.jkozak.pl/przedmioty/java/zadania4.pdf
import java.util.Scanner;

public class Palindrom {

    static String revereseString(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result = result + text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj napis: ");
       // String napis = Scanner.nextLine();             //coś tu nie działa z nextline
    }

}

// public class Zadanie3Palindrom {
//static boolean isPalindrom(String text) {
// for (int i = 0; i < text.length() - 1 - i)) {
// continue;
// } else {
// return false;
// }
// }
// return true;