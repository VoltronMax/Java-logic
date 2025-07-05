import java.util.Scanner;
public class Logica9 {

    public static void main(String[] args) {

        //Programa para definir el numero entero mayor del arreglo
        var input = new Scanner(System.in);

        int[] numeros = new int[10];
        
        System.out.println("Ingrese el numero de la casilla 1");
        numeros[0] = input.nextInt();
        int mayor = numeros[0];

        for (int i=1; i<numeros.length; i++){
            System.out.println("Ingrese el valor de la casilla " + (i+1));
            numeros[i] = input.nextInt();

                if (numeros[i] > mayor) {
                    mayor=numeros[i];
        }
            
        }
        System.out.println("EL numero mayor dentro del arreglo es: " + mayor);

        input.close();
    }
    
}
