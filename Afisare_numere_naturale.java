import java.util.Scanner;

public class Afisare_numere_naturale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* algoritm care citește de la tastatură un număr n
        și afișează toate numerele naturale mai mici sau egale cu n
        precedate alternativ de unul dintre simbolurile +, *, ~, -
        */

        System.out.println("Introduceti un numar n:");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            switch (i % 4) {
                case 0:
                    System.out.print("+" + i);
                    break;
                case 1:
                    System.out.print("*" + i);
                    break;
                case 2:
                    System.out.print("~" + i);
                    break;
                case 3:
                    System.out.print("-" + i);
                    break;
            }

        }
    }
}
