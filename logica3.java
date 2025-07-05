import java.util.Scanner;
public class logica3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un numero positivo");

        int dab = s.nextInt();
        int cont=0;

        if (dab<0){
            System.out.println("Bobo setentahpta");
        } else{
            for (int i = 1; i<=dab; i++){
            if (dab%i==0){
                cont++;
            }
        }

if (cont==2){
    System.out.println("El numero es primo");
} else {
    System.out.println("No es primo");
}

        }

        

        s.close();
        
    }
}
