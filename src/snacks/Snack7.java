package snacks;

//CONSEGNA
//Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)
public class Snack7 {
    public static void main(String[] args) {
        //poi questo si può sostituire con la richiesta del dato all'utente
        final int SECONDS =3676;

        //unità di misura
        int minute = 60;
        int hour = minute * 60; //3600

        //calcoli
        int hours = SECONDS / hour; //3676 / 3600 = 1
        int minutes = SECONDS % hour / minute; //3676 % 3600 = 76 / 60 = 1
        int seconds = SECONDS % minute; // 3676 % 60 = 16

        //Conversione in stringa
        String sHours = Integer.toString(hours);
        String sMinutes = Integer.toString(minutes);
        String sSeconds = Integer.toString(seconds);
        //se sono a una cifra aggiungo uno 0
        if(hours < 10) {
            sHours = "0" + sHours;
        }
        if(minutes < 10) {
            sMinutes = "0" + sMinutes;
        }
        if(seconds < 10) {
            sSeconds = "0" + sSeconds;
        }

        //Stampo il risultato
        System.out.println(SECONDS + " --> " + sHours + ":" + sMinutes + ":" + sSeconds);
    }
}
