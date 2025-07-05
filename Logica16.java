import java.util.Scanner;
public class Logica16 {

    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.println("Ingrese cuantos productos va a registrar");
        int prod = input.nextInt();

        String[]producto = new String[prod];
        int[]cantidad = new int[prod];
        double[]precio = new double[prod];

        for (int i=0; i<prod; i++){
            System.out.println("Ingrese el nombre del producto #" + (i+1));
            input.nextLine();
            producto[i]=input.nextLine();


            System.out.println("Ingrese la cantidad del producto #" + (i+1));
            cantidad[i]=input.nextInt();
            while (cantidad[i]<=0) {
                System.out.println("Cantidad erronea, ingrese nuevamente");
                cantidad[i]=input.nextInt();
            }

            System.out.println("Ingrese el valor individual del producto #" + (i+1));
            precio[i]=input.nextDouble();
            while (precio[i]<=0) {
                System.out.println("Valor erroneo, ingrese nuevamente");
                precio[i]=input.nextDouble();
            }
        }

        double[]subtotalProducctos = new double[prod];

        for (int i=0; i<prod; i++){
            subtotalProducctos[i]=precio[i]*cantidad[i];
                
            }

            double total=0;
        
        System.out.println("\n ---Resumen de los productos a registrar---");
        for (int i=0; i<prod; i++){
            System.out.println("Producto: " + producto[i]);
            System.out.println("Cantidad: " + cantidad[i]);
            System.out.println("Precio unitario: $" + precio[i]);
            System.out.println("Subtotal: $" + subtotalProducctos[i]);
            System.out.println("------------------------------------------");

            total += subtotalProducctos[i];
        }

        System.out.println("Total general a pagar: $" + total);

        input.close();
        
    }
    
}
