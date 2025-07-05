import java.util.Scanner;
public class Logica10 {

    public static void main(String[] args) {

        //Programa para clasificar numeros positivos, negativos, y cero en un arreglo
        var input = new Scanner(System.in);
        int posi = 0;
        int nega = 0;
        int cero = 0;

        int numeros[] = new int[10];

        for (int i=0; i<numeros.length; i++){
            System.out.println("Ingrese el numero de la casilla " + (i+1));
            numeros[i] = input.nextInt();
            if (numeros[i]==0) {
                cero++;
            } else if (numeros[i]<0){
                nega++;
            } else {
                posi++;
            }
        }

        System.out.println("Positivos: " + posi);
        System.out.println("Negativos: " + nega);
        System.out.println("Ceros: " + cero);

        
        input.close();
    }
    
}
