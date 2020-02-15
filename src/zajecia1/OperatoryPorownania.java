package zajecia1;

public class OperatoryPorownania {
    public static void main(String[] args) {
        int wiek = 18;

        //wersja 1
        boolean czyPelnoletni = wiek == 18;
        System.out.println(czyPelnoletni);

        //wersja 2
        System.out.println(wiek == 18);

        //większy lub równy
        System.out.println("Czy wiek większy równy 18?" + (wiek <= 18));

        //mniejszy lub równy
        System.out.println("Czy wiek mniejszy lub równy 18?" + (wiek >= 18));

        // wynik różny od
        System.out.println("czy wiekmróżny od 20" + (wiek != 20));



    }


}
