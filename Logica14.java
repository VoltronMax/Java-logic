import java.util.Scanner;
public class Logica14 {
    public static void main(String[] args) {

        var input = new Scanner (System.in);
        
        var cont = 0;
        int [] numeros = new int[10];

        for (int i=0; i<numeros.length; i++){
            System.out.println("Numero #" + (i+1));
            numeros[i] = input.nextInt();
        }

        System.out.println("pipi popo");
        int num = input.nextInt();
        for (int j=0; j<numeros.length; j++ )
        if (numeros[j]==num){
            cont++;
        }
        System.out.println(cont);


        input.close();
    }
    
}
