package snacks;

import java.util.Scanner;

//CONSEGNA
//Chiedi un numero di 4 cifre all’utente e calcola la somma di tutte le cifre che compongono il numero
public class Snack8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        do {
            System.out.print("Scrivi un numero di 4 cifre:");
            num = scan.nextInt();
            if(num < 1000 || num > 9999) {
                System.out.println("Il numero deve avere 4 cifre!");
            }
        }while (num < 1000 || num > 9999);

        //metodo senza aiuto
        int unitDigit = num % 10;  //1234 % 10 = 4
        int tensDigit = (num % 100) / 10; //1234 % 100 = 34 / 10 = 3 (i rotti sono tagliati perché int)
        int hundredsDigit = (num % 1000) / 100; // 1234 % 1000 = 234 / 100 = 2
        int thousandsDigit = num / 1000; // 1234 / 1000 = 1

        int sum = unitDigit + tensDigit + hundredsDigit + thousandsDigit;

        System.out.println("La somma delle cifre è: " + sum);

        //metodo con aiuto
        int unitDigitHelp = num % 10; //1234 % 10 = 4
        int tensDigitHelp = num / 10 % 10; //1234 / 10 = 123 % 10 = 3 (i rotti sono tagliati perché int)
        int hundredsDigitHelp = num / 100 % 10; //1234 / 100 = 12 % 10 = 2
        int thousandsDigitHelp = num / 1000 % 10; //1234 / 1000 = 1 % 10 = 1

        int sumHelp = unitDigitHelp + tensDigitHelp + hundredsDigitHelp + thousandsDigitHelp;

        System.out.println("La somma delle cifre è: " + sumHelp);

        //metodo con ciclo
        int sumCycle = 0;
        int digit = num;

        for (int i = 0; i < 4; i++) {
            if(i > 0) {
                digit = num / (int)Math.pow(10,i);
            }
            digit = digit % 10;
            sumCycle += digit;
        }

        System.out.println("La somma delle cifre è: " + sumCycle);

        scan.close();
    }
}
