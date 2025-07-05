import java.util.Scanner;
public class logica5 {

    public static void main(String[] args) {

        //Crear un programa que detecte si un numero es par, impar, negativo, o cero

        var input = new Scanner (System.in);

        System.out.println("Por favor, ingrese un numero entero");
        int numeroEntero = input.nextInt();

        if (numeroEntero>0 && numeroEntero%2==0){
            System.out.println("Su numero es un entero positivo par");
        } else if (numeroEntero>0 && numeroEntero%2!=0){
            System.out.println("Su numero es un entero positivo impar");
        } else if (numeroEntero==0){
            System.out.println("Su numero es 0");
        }else {
            System.out.println("Su numero es negativo");
        }

        input.close();
    }
    
}
