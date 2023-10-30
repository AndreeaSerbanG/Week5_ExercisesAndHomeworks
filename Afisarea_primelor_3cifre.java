import java.util.Scanner;

public class Afisarea_primelor_3cifre {
    /*The program reads an integer from the keyboard and displays
    the first 3 digits of the number, from end to beginning.
    If the number is less than 3 digits, the program will display an error message
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti un numar intreg cu mai mult de trei cifre:");
        int nr = sc.nextInt();
        int contor = 0;

        if (nr < 100) {
            System.out.println("Numarul introdus trebuie sa contina cel putin 3 cifre");
        } else {
            while (nr != 0) {
                int ultimaCifra = nr % 10;

                System.out.print(ultimaCifra + " ");

                contor++;
                nr /= 10;

                if (contor == 3) {
                    break;
                }
            }
        }
    }
}
