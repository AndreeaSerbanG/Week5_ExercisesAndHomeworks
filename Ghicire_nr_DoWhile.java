import java.util.Scanner;

public class Ghicire_nr_DoWhile {
    /*
    The program implements a game in which the user must guess a magic number.
    int numarMagic will be read from the keyboard, being an integer value in the range [0, 10].
    Afterwards, the user will enter numbers from the keyboard and the program will give them indications
    about the entered number.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nrMagic = 7;
        int numar;
        do {
            System.out.println("Introduceti numarul magic:");
            numar = sc.nextInt();
            if (numar < 0 || numar > 10) {
                System.out.println("Atentie! Numarul magic se afla in intervalul [0, 10]");
            } else if (numar > nrMagic) {
                System.out.println("Esti aproape! Dar numarul magic este mai mic.");
            } else if (numar < nrMagic) {
                System.out.println("Esti aproape! Dar numarul magic este mai mare.");
            }
        } while (numar != nrMagic);
        System.out.println("Ai ghicit, bravo!");
    }
}
