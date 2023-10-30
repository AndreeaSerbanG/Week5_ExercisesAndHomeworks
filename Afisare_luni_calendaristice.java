import java.util.Scanner;

public class Afisare_luni_calendaristice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* aplicație care afișează toate lunile calendaristice (în limba română)
           care încep cu o anumită literă, introdusă de utilizator de la tastatură.
        */

        System.out.println("Introduceti o litera:");
        String litera = sc.next();
        litera = litera.toLowerCase();

        while( !litera.equals("x") && !litera.equals("X")){

            switch (litera) {

                case "i":
                    System.out.println("Ianuarie\nIunie\nIulie");
                    break;
                case "f":
                    System.out.println("Februarie");
                    break;
                case "m":
                    System.out.println("Martie\nMai");
                    break;
                case "a":
                    System.out.println("Aprilie\nAugust");
                    break;
                case "s":
                    System.out.println("Septembrie");
                    break;
                case "o":
                    System.out.println("Octombrie");
                    break;
                case "n":
                    System.out.println("Noiembrie");
                    break;
                case "d":
                    System.out.println("Decembrie");
                    break;
                default:
                    System.out.println("Nicio luna nu incepe cu litera " + litera);
                    break;

            }
            litera = sc.next();
            litera = litera.toLowerCase();
        }
        System.out.println("Programul se inchide...");
    }
}
