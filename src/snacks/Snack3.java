package snacks;

//CONSEGNA
//Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
public class Snack3 {
    public static void main(String[] args) {
        final int[] NUMBERS = {5, 22, 34, 2, 18};
        int sum = 0;
        //ho inteso "posizione" come la intenderebbe un umano, quindi il primo numero è alla posizione 1
        //per questo nel IF c'è i+1, altrimenti bastava i
        for (int i = 0; i < NUMBERS.length; i++) {
            if ((i + 1) % 2 != 0) {
                sum += NUMBERS[i];
            }
        }
        System.out.println(sum);
    }
}
