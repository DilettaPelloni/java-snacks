package snacks;

//CONSEGNA
//Data in input una stringa verificare se è palindroma

//IMPORT
import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        //prendo in input una stringa
        Scanner scan = new Scanner(System.in);
        System.out.print("Scrivimi una stringa: ");
        String s = scan.nextLine();

        //Per farlo funzionare anche con le frasi tolgo gli spazi
        String sWoSpaces = s.replaceAll(" ", "");

        String invS = "";
        for (int i = sWoSpaces.length() - 1; i >= 0; i--) {
            invS += sWoSpaces.charAt(i);
        }

        if (sWoSpaces.equalsIgnoreCase(invS)) {
            System.out.println("La stringa " + s + " è palindroma");
        } else {
            System.out.println("La stringa " + s + " non è palindroma");
        }
    }
}
