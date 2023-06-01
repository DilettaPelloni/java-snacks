package snacks;

//CONSEGNA
//Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
//Possibile usare solo:
//cicli
//chartAt
//if / switch
//Es. “25" come stringa deve essere convertito in intero 25.

public class Snack6 {
    public static void main(String[] args) {

        final String S_NUM = "350";
        int num = 0;
        int sum = 0;
        int counter = 0;

        for (int i = S_NUM.length() - 1; i >= 0; i--) {
            switch (S_NUM.charAt(i)) {
                case '1':
                    num = 1;
                    break;
                case '2':
                    num = 2;
                    break;
                case '3':
                    num = 3;
                    break;
                case '4':
                    num = 4;
                    break;
                case '5':
                    num = 5;
                    break;
                case '6':
                    num = 6;
                    break;
                case '7':
                    num = 7;
                    break;
                case '8':
                    num = 8;
                    break;
                case '9':
                    num = 9;
                    break;
                case '0':
                    num = 0;
                    break;
            }

            num = num * (int)Math.pow(10, counter);
            sum += num;
            counter++;
        }

        System.out.println(sum);
    }
}
