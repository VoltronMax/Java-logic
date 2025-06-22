import java.util.Scanner;
public class Logica8 {

    public static void main(String[] args) {
        
        //Programa para contar cuantos digitos hay en un numero sin importar el signo

        var input = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        int numero = input.nextInt();
        int cap = numero;

        numero = Math.abs(numero);

        if (numero==0){
            System.out.println("El numero 0 tiene 1 cifra");
        } else {
            int cont = 0;
            while (numero>0){
                numero/=10;
                cont++;
            }

            System.out.println("El numero " + cap + " tiene " + cont + " digitos");
        }

        input.close();
    }
    
}
