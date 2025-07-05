import java.util.ArrayList;

public class Logica12 {

    public static void main(String[] args) {

        //Programa que muestre los numeros primos entre 1 y 100

        ArrayList<Integer> primos = new ArrayList<>();

        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                primos.add(i);
            }
        }

        for (int j = 0; j < primos.size(); j++) {

                System.out.print(primos.get(j) + " - ");

        }
    }
}
    
