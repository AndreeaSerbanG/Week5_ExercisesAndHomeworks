import java.util.Scanner;

public class Numarul_de_zile_al_lunii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* program care citește de la tastatură numele unei luni
           și afișează numărul de zile al acelei luni
        */
        System.out.println("Introduceti numele unei luni ale anului:");
        String luna = sc.next();

        while(!luna.equals("exit")) {

            switch (luna) {
                case "Ianuarie":
                case "Martie":
                case "Mai":
                case "Iulie":
                case "August":
                case "Octombrie":
                case "Decembrie":
                    System.out.println("Luna " + luna + " are 31 de zile");
                    break;
                case "Februarie":
                    System.out.println("Luna Februarie are 28 de zile, respectiv 29  de zile in anii bisecti.");
                    break;
                case "Aprilie":
                case "Iunie":
                case "Septembrie":
                case "Noiembrie":
                    System.out.println("Luna " + luna + " are 30 de zile");
                    break;
                default:
                    System.out.println("Luna " + luna + " nu este o luna sau o comanda valida.");
                    break;
            }
            luna = sc.next();
        }
    }
}
