package snacks;

//CONSEGNA
//Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
//Continuare a chiedere una nuova stringa finché non si inserisce 0.

//IMPORT
import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;
        do {
            System.out.println("Inserisci una stringa fatta di diversi caratteri:");
            System.out.println("Se vuoi terminare il programma premi 0\n");

            userInput = scan.nextLine();

            if(!(userInput.equals("0"))) {
                int alfaCounter = 0;
                int numCounter = 0;
                int symCounter = 0;

                //soluzione punk
//                for (int i = 0; i < userInput.length(); i++) {
//                    if((userInput.toLowerCase().charAt(i) >= 'a' && userInput.toLowerCase().charAt(i) <= 'z')) {
//                        alfaCounter ++;
//                    } else if ((userInput.charAt(i) >= '0' && userInput.charAt(i) <= '9')) {
//                        numCounter++;
//                    } else {
//                        symCounter++;
//                    }
//                }

                //soluzione con metodi
                for (int i = 0; i < userInput.length(); i++) {
                    if(Character.isAlphabetic(userInput.charAt(i))) {
                        alfaCounter ++;
                    } else if (Character.isDigit(userInput.charAt(i))) {
                        numCounter++;
                    } else {
                        symCounter++;
                    }
                }

                System.out.println("La stringa " + userInput + " contiene:");
                System.out.println(alfaCounter + " caratteri alfabetici");
                System.out.println(numCounter + " caratteri numerici");
                System.out.println(symCounter + " caratteri speciali");

            }
        }while (!(userInput.equals("0")));
    }
}
