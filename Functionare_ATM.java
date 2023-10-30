import java.util.Scanner;

public class Functionare_ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* se citește de la tastatură un număr natural nenul n
         care corespunde unei anumite operații ce poate fi realizată de către ATM
        */

        String pinCorect = "2772";

        //Verificarea codului PIN:
        System.out.println("Introduceti codul PIN ( si apasati Enter):");
        String pinClient = sc.next();

        if (pinClient.equals(pinCorect)) {

            System.out.println("===== Bine ati venit =====\n" +
                    "\t1. Interogare Sold\n" +
                    "\t2. Retragere Numerar\n" +
                    "\t3. Depunere\n" +
                    "\t4. Info\n" +
                    "\t5. Curs Valutar\n" +
                    "\t6. Iesire");

            int n = sc.nextInt();
            int sold = 5000;
            int retragere;
            int depunere;
            String data = "02.11.2022";

            while( n!=6){

                switch (n) {

                    case 1:
                        System.out.println("Soldul dumneavoastra este " + sold);
                        break;
                    case 2:
                        System.out.println("Introduceti suma pe care doriti sa o retrageti:");
                        retragere = sc.nextInt();
                        if (retragere <= sold && retragere > 0 && retragere % 10 ==0) {
                            System.out.println("Operatiune efectuata cu succes!");
                            sold -= retragere;
                        }else if ( retragere % 10 != 0){
                            System.out.println("Suma introdusa trebuie sa fie multiplu de 10. Reluati operatiunea!");
                        }else{
                            System.out.println("Suma invalida. Reluati operatiunea!");
                        }
                        break;
                    case 3:
                        System.out.println("Introduceti suma pe care doriti sa o depuneti:");
                        depunere = sc.nextInt();
                        if( depunere > 0 && depunere % 10 == 0) {
                            sold += depunere;
                            System.out.println("Operatiune efectuata cu succes!");
                        }else if ( depunere % 10 != 0){
                            System.out.println("Suma introdusa trebuie sa fie multiplu de 10. Reluati operatiunea!");
                        }else {
                            System.out.println("Suma invalida. Reluati operatiunea!");
                        }
                        break;
                    case 4:
                        System.out.println("Cursul valutar BNR la data " + data + " este 1 Euro = 4.9113 RON");
                        break;
                    case 5:
                        System.out.println("Va multumim ca sunteti client al Bancii DevBank!" +
                                "\nDaca intampinati probleme in utilizarea bancomatului, " +
                                "va rugam apelati numarul 0236 100 100. ");
                        break;
                    default:
                        System.out.println("Optiuni disponibile\n" +
                                "\t1. Interogare Sold\n" +
                                "\t2. Retragere Numerar\n" +
                                "\t3. Depunere\n" +
                                "\t4. Info\n" +
                                "\t5. Curs Valutar\n" +
                                "\t6. Iesire");
                        break;

                }
                n = sc.nextInt();
            }

        }else{
            System.out.println("PIN incorect!Reluati operatiunea!");
        }
    }
}
