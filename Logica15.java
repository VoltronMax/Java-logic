import java.util.Scanner;
public class Logica15 {

    public static void main(String[] args) {
        var input = new Scanner(System.in);

        //programa para identificar cuantos digitos pares o impares hay dentro de un numero

        System.out.println("Ingrese un numero");
        int numero = input.nextInt();

        int pares=0;
        int impares=0;

        while (numero>0) {
            int digito = numero % 10;

            
            if (digito%2==0){
                pares++;

            } else {
                impares++;
            }
            numero/=10;
        }

        System.out.println(pares);
        System.out.println(impares);

        
        input.close();
    }
    
}
