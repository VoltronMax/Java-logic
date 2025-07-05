import java.util.*;
public class Logica19 {
    public static void main(String[] args) {

        var input = new Scanner(System.in);

        System.out.println("Cuantos productos llevara?");
        int pro = input.nextInt();
        input.nextLine();
        
        String[]nombre = new String[pro];
        double[]precio = new double[pro];
        double prom = 0;

        for (int i=0; i<pro; i++){
            System.out.println("Ingrese el nombre del producto #" + (i+1));
            nombre[i] = input.nextLine();
            System.out.println("Ingrese el valor del producto #" + (i+1));
            precio[i]= input.nextDouble();
            while (precio[i]<0) {
                System.out.println("Valor ingresado no valido, ingreselo nuevamente");
            precio[i]= input.nextDouble();
            }
            input.nextLine();

            prom+=precio[i];
            
        }

        double iva = prom+(prom*0.19);

        System.out.println("\n---Resumen de la compra---");
        for (int j=0; j<pro; j++){
            System.out.println("Producto: " + nombre[j]);
            System.out.println("Precio: $" + precio[j]);


        }
        System.out.println(prom);
        System.out.println(iva);
        System.out.println();






input.close();
        
    }
    
}
