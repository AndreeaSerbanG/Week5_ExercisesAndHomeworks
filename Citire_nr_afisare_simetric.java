import java.util.Scanner;

public class Citire_nr_afisare_simetric {
    /*
    The program reads natural numbers from the keyboard until a negative number is entered.
    If the read number ends in one of the digits 3, 7 or 9, the number is ignored and the next numbers are read.
    Otherwise, the "symmetric" of the number is displayed on the console.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for ( int i = 1; i <= 100; i++){

            System.out.println("Introduceti un numar pozitiv:");
            int n = sc.nextInt();
            int simetric;

            if( n >= 0) {

                int ultimaCifra;
                simetric = 0;
                ultimaCifra = n % 10;

                if (ultimaCifra == 3 || ultimaCifra == 7 || ultimaCifra == 9) {
                    i++;
                    continue;
                }
                while (n != 0) {
                    ultimaCifra = n % 10;
                    simetric = simetric * 10 + ultimaCifra;
                    n /= 10;
                }
                System.out.println(simetric);
            }else {
                break;
            }

        }
    }
}
