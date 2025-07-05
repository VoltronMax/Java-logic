import java.util.Scanner;
public class logica4 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("Ingrese un numero positivo");
        
        int a = s.nextInt();
        int cont = 0;

        if (a>0) {

            for(int i=1; i<=a; i++){
            if (i%3==0 || i%5==0){

                cont+=i;

            }

        }

        System.out.println(cont);
        
        } else {

            System.out.println("Bobo");

        }

        s.close();
        
    }
    
}
