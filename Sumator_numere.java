import java.util.Scanner;

public class Sumator_numere {
    /*
    The program will perform the sum of the numbers entered by the user,
    until a negative number is entered, but not more than 10 numbers.
    It will end in either of two cases:

    -The user has already entered 10 numbers.
    -The user enters a negative number
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for ( int i = 1; i <= 10; i++){
            System.out.println("Introduceti un numar pozitiv:");
            int n = sc.nextInt();

            if( n >= 0){
                sum += n;
            }else{
                break;
            }
        }
        System.out.println("Suma numerelor pozitive este:" + sum);
    }
}
