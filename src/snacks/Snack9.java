package snacks;

//CONSEGNA
//Calcola la somma e la media dei primi 10 numeri.

public class Snack9 {
    public static void main(String[] args) {

        int TOTAL_NUMBERS = 10;
        int sum = 0;
        for (int i = 1; i <= TOTAL_NUMBERS ; i++) {
            sum += i;
        }
        double avg = (double)sum / TOTAL_NUMBERS;

        System.out.println("La somma dei primi " + TOTAL_NUMBERS + " numeri è: " + sum);
        System.out.println("La media dei primi " + TOTAL_NUMBERS + " numeri è: " + avg);
    }
}
