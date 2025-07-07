import java.util.*;
public class gestionProductos {

        static int productos;
        static double[]precioProducto;
        static String[]nombreProducto;
        static int[]stockProducto;
        static boolean productoRegistrado = false;

    public static void main (String []args){
        var input = new Scanner (System.in);
        mostrarMenu(input);

    }

    private static void mostrarMenu(Scanner input) {

        var salida = false;
        do{
            System.out.println("Bienvenido al sistema de gestion de productos");
            System.out.println("""
                \n ---Menu principal---
                1. Registrar productos
                2. Mostrar todos los productos
                3. Mostrar productos con stock bajo
                4. Mostrar productos mas costosos
                5. Mostrar valor total del inventario
                0. Salir
                    """);

                var opcion = input.nextInt();
                input.nextLine();

                switch (opcion) {
                    case 1:
                    registrarProductos(input);
                        break;

                    case 2:
                    mostrarProductos();
                    break;

                    case 3:
                    mostrarStockBajo();
                    break;

                    case 4:
                    mostrarProductoMasCostoso();
                    break;

                    case 5:
                    mostrarValorTotalInventario();
                    break;

                    case 0:
                    System.out.println("Saliendo");
                    salida = true;
                    break;
                
                    default:
                    System.out.println("Opcion invalida");
                        break;
                }

        } while (!salida);
        System.out.println("Hasta pronto");
    }

    private static void mostrarValorTotalInventario() {
            if (!productoRegistrado){
        System.out.println("No se han registrado productos");
        } else {

        double total= 0;
        for (int i=0; i<productos; i++){
            total+=precioProducto[i]*stockProducto[i];

        }
        System.out.printf("Valor total del inventario : $%.2f\n", total);
        }

    }

    private static void mostrarProductoMasCostoso() {
        if (!productoRegistrado){
        System.out.println("No se han registrado productos");
        } else {

        var may = 0.0;
        int i;

        for (i=0; i<productos; i++){
            if (precioProducto[i]>=may){
                may=precioProducto[i];
            }
        }

        System.out.println(".:Productos mas costosos:.\n");
            for (i=0; i<productos; i++ ){
            if (precioProducto[i]==may){
                System.out.println("==========================================");
                System.out.println("Producto #" + (i+1));
                System.out.println("Nombre: " + nombreProducto[i]);
                System.out.println("Precio: $" + precioProducto[i]);
                System.out.println("Stock: " + stockProducto[i]);
                System.out.println("==========================================");
            }
        }
        }
        

    }

    private static void mostrarStockBajo() {
            if (!productoRegistrado){
            System.out.println("No se han registrado productos");
        } else {
        int i;
        System.out.println(".:Productos con stock bajo (menos de 5 unidades):.");
        var hayStockBajo = false;

        for (i=0; i<productos; i++){
            if (stockProducto[i]<5) {
            hayStockBajo = true;
                System.out.println("");
                System.out.println("==========================================");
                System.out.println("Producto #" + (i+1));
                System.out.println("Nombre: " + nombreProducto[i]);
                System.out.println("Precio: $" + precioProducto[i]);
                System.out.println("Stock disponible: " + stockProducto[i]);
                System.out.println("==========================================\n");
                
                }
            }
            if (!hayStockBajo){
                System.out.println("Todos los productos tienen un stock considerable");
            }
        }

        }

    private static void mostrarProductos() {
        if (!productoRegistrado){
            System.out.println("No se han registrado productos");
        } else {
        System.out.println(".:Resumen de productos registrados:.\n");
        int i;

        for(i=0; i<productos; i++){
            System.out.println("==============================================");
            System.out.println(".:Producto #" + (i+1));
            System.out.println("Nombre del producto: " +  nombreProducto[i]);
            System.out.println("Precio del producto: $" + precioProducto[i]);
            System.out.println("Stock del producto: " + stockProducto[i]);
            System.out.println("===============================================\n");
        }
        }

    }

    private static void registrarProductos(Scanner input) {
        do{
            System.out.println("Ingrese cuantos productos va a registrar");
        productos = input.nextInt();
        input.nextLine();
        if (productos<=0) {
            System.out.println("Debe ingresar al menos un producto");
        }

        } while (productos<=0);

        nombreProducto = new String[productos];
        precioProducto = new double[productos];
        stockProducto = new int[productos];

        int i;
        for (i=0; i<productos; i++){
            do{
                System.out.println("Ingrese el nombre del producto #" + (i+1));
                nombreProducto[i] = input.nextLine();
                
                if (nombreProducto[i].isBlank()){
                    System.out.println("No puede dejar espacios en blanco");
                }
            } while (nombreProducto[i].isBlank());

            do{
            System.out.println("Ingrese el valor del producto #" + (i+1));
            precioProducto[i] = input.nextDouble();
            input.nextLine();

            if(precioProducto[i]<=0){
                System.out.println("El valor debe ser mayor a $0");
            }
            } while (precioProducto[i]<=0);

            do{
                System.out.println("Ingrese el numero de stock del producto #" + (i+1));
                stockProducto[i] = input.nextInt();
                input.nextLine();

                if (stockProducto[i]<0){
                    System.out.println("El stock debe ser mayor o igual a cero");
                }
            } while (stockProducto[i]<0);
        }

        System.out.println("\n.:Registro completado con exito:.\n");
        productoRegistrado = true;
        
    }
    
}
