import java.util.Scanner;
public class Logica7 {

    //Escribir un programa para determinar si un numero es primo o no usando el bucle while y booleanos

    public static void main(String[] args) {
        var input = new Scanner (System.in);

        System.out.println("Ingrese un numero entero positivo");
        int numero = input.nextInt();

        if (numero<1){
            System.out.println("El numero debe ser mayor a 1");
        } else {
            int i = 2;
            boolean esPrimo = true;
        
        while (i<=numero/2) {
            if (numero%i==0){
                esPrimo=false;
                break;
            }
            i++;
        }

        if (esPrimo){
            System.out.println("El numero " + numero + " es primo");
        } else{
            System.out.println("El numero: " + numero + " no es primo");
        }
    }

        input.close();
    }
    
}
