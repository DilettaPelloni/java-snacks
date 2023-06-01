package snacks;

//CONSEGNA
//Generatore di “nomi cognomi” casuali:
//Il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.

//IMPORT
import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {

        //lista di nomi
        final String[] NAMES = {"Paolo", "Giovanni", "Luca"};
        //lista cognomi
        final String[] SURNAMES = {"Rossi", "Bianchi", "Verdi"};

        //creo un'istanza di random
        Random ran = new Random();

        //Ho deciso che la lista conterrà 5 persone (la consegna non specifica)
        for (int i = 0; i < 5; i++) {
            String person = NAMES[ran.nextInt(NAMES.length)] + " " + SURNAMES[ran.nextInt(SURNAMES.length)];
            System.out.println(person);
        }
    }
}
