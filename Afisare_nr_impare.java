import java.util.Scanner;

public class Afisare_nr_impare {
    //The program displays the first 5 odd numbers from a given range.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti un capatul stang al intervalului:");
        int left = sc.nextInt();

        System.out.println("Introduceti un capatul drept al intervalului:");
        int right = sc.nextInt();

        int counter = 0;

        for (int i = left; i <= right; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
                counter++;
            }
            if (counter == 5) {
                break;
            }
        }
    }
}
