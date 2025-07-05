import java.util.*;
public class inventariopatapim {

    public static void main(String[] args) {
        var input = new Scanner (System.in);

        System.out.println(".:Bienvenido al mini inventario:.");
        System.out.println("Ingrese cuantos productos quiere registrar");

        int opc = input.nextInt();
        input.nextLine();

        int may= 0; //contador para los productos mayores a 10.000
        int die = 0; //contador para los productos con stock mayor o igual a 10

        String[]nombreProducto = new String[opc];
        double[]valorProducto = new double[opc];
        int[]stockProducto = new int [opc];
        double[]subtotal = new double[opc];
        double tot = 0;

        for(int i = 0; i<opc; i++){
            System.out.println("\nIngrese el nombre del producto #" + (i+1));
            nombreProducto[i] = input.nextLine();

            System.out.println("Ingrese el valor del producto #" + (i+1));
            valorProducto[i] = input.nextDouble();
            while (valorProducto[i]<=0) {
                System.out.println("El valor no puede ser negativo o cero \n Ingrese nuevamente");
                valorProducto[i] = input.nextDouble();
            }
            if (valorProducto[i]>10000){
                may++;
            }

            System.out.println("Ingrese el stock del producto #" + (i+1));
            stockProducto[i] = input.nextInt();
            while (stockProducto[i]<=0) {
                System.out.println("Debe haber stock. Ingrese una cantida positiva");
                stockProducto[i] = input.nextInt();
            }
            if (stockProducto[i]>10){
                die++;
            }

            subtotal[i]= valorProducto[i]*stockProducto[i];
            tot+=subtotal[i];
            input.nextLine();

        }

        System.out.println("\n.:Resumen del inventario:.");
        for (int i = 0; i<opc; i++){
            System.out.println("Producto: " + nombreProducto[i]);
            System.out.println("Precio: $" + valorProducto[i]);
            System.out.println("Stock: " + stockProducto[i]);
            System.out.printf("Subtotal : $%.2f", subtotal[i]);
            System.out.println("");
        }

        System.out.printf("\nValor total del inventario: %.2f$", tot);
        System.out.println("");
        System.out.println("Productos con valor mayor a $10.000: " + may);
        System.out.println("Productos con stock mayor o igual a 10: " + die);

        
        input.close();
    }
    
}
