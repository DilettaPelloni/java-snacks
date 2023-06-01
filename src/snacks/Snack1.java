package snacks;

//IMPORT
import java.util.Scanner;

//CONSEGNA
//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int num = scan.nextInt();
        if(num % 2 == 0) {
            System.out.println(num + " è pari, quindi stampo " + num);
        } else {
            System.out.println(num + " è dispari, quindi stampo " + (num + 1));
        }
        scan.close();
    }
}
