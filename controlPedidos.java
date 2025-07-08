import java.util.*;
public class controlPedidos {
    static int registro;
    static String[]nombreCliente;
    static String[]nombreProducto;
    static double[]precioUnitario;
    static int[]cantidadSolicitada;
    static boolean pedidoRegistrado = false;
    static double[]totalProducto;
    static double valorGeneral;

public static void main (String args[]){
    var input = new Scanner (System.in);
    mostrarMenu(input);
}
private static void mostrarMenu(Scanner input) {

    var salida = false;
    do{
    System.out.println("\n.:Bienvenido al sistema basico de control de pedidos:.");
    System.out.println("--------------------------------------------------------");
    System.out.println("""
        1. Registrar pedidos
        2. Mostrar productos registrados
        3. Mostrar valor total de cada pedido
        4. Mostrar Pedido con mayor valor total
        5. Mostrar valor total de todos los pedidos registrados
        6. Mostar pedido x nombre del cliente
        --------------------------------------------------------
            """);
        System.out.println("Ingrese la opcion a escoger");
        int eleccion = input.nextInt();
        input.nextLine();

        switch (eleccion) {
            case 1:
            registrarProducto(input);
            break;

            case 2:
            mostrarPedidosRegistrados();
            break;

            case 3:
            valorTotal();
            break;
        
            case 4:
            pedidoMayorTotal();
            break;

            case 5:
            valorTotalGeneral();
            break;

            case 6:
            pedidoPorNombre(input);
            break;

            default:
            System.out.println("Opcion invalida");
                break;
        }
    } while (!salida);
    System.out.println("Saliendo...");
}

private static void registrarProducto(Scanner input) {
    System.out.println("\n===============================");
    do{
    System.out.println("Ingrese los pedidos a registrar");
    registro = input.nextInt();
    input.nextLine();
    if (registro<=0){
        System.out.println("Ingrese una cantidad de pedidos valida");
    }
    } while (registro<=0);

    nombreCliente = new String[registro];
    nombreProducto = new String[registro];
    precioUnitario = new double[registro];
    cantidadSolicitada = new int [registro];

    int i;

    for (i=0; i<registro; i++){
        System.out.println(".:Pedido #" + (i+1) + ":.");
        do{
            System.out.println("Ingrese el nombre del cliente");
            nombreCliente[i] = input.nextLine();
            if (nombreCliente[i].isBlank()){
                System.out.println("Debe ingresar un texto");

            }
        } while (nombreCliente[i].isBlank());

        do{
            System.out.println("Ingrese el nombre del producto");
            nombreProducto[i] = input.nextLine();
            if (nombreProducto[i].isBlank()){
                System.out.println("Debe ingresar un texto");
            }
        } while (nombreProducto[i].isBlank());
            
        

        do {
            System.out.println("Ingrese el precio unitario del producto");
            precioUnitario[i] = input.nextDouble();
            if (precioUnitario[i]<=0){
                System.out.println("El precio del producto tiene que ser mayor a 0");
            }
        } while (precioUnitario[i]<=0);

        do{
            System.out.println("Ingrese la cantidad de productos solicitada");
            cantidadSolicitada[i] = input.nextInt();
            input.nextLine();
            if (cantidadSolicitada[i]<=0){
                System.out.println("Debe solicitar cantidades mayores a 0");
            }
        } while (cantidadSolicitada[i]<=0);
        
        System.out.println("Registro realizado con exito!");
        pedidoRegistrado = true;
        }

    }

private static void mostrarPedidosRegistrados() {

    System.out.println("\n.:Resumen de pedidos registrados:.");
    if (!pedidoRegistrado){
        System.out.println("No se han registrado pedidos");
    } else {

        int i;
        for (i=0; i<registro; i++){

            System.out.println("\n=========================================");
            System.out.println(".:Producto #" + (i+1) + ":.");
            System.out.println("Nombre del cliente: " + nombreCliente[i]);
            System.out.println("Nombre del producto: " + nombreProducto[i]);
            System.out.println("Precio unitario: $" + precioUnitario[i]);
            System.out.println("Cantidad solicitada: " + cantidadSolicitada[i]);
            System.out.println("===========================================\n");

        }
    }
}
private static void valorTotal() {
        if (!pedidoRegistrado){
        System.out.println("No se han registrado pedidos");
    } else {
        totalProducto = new double[registro];
        for (int i = 0; i<registro; i++){

            totalProducto[i]=precioUnitario[i]*cantidadSolicitada[i];
            System.out.println("Pedido #" + (i+1));
            System.out.printf("Total: %.2f", totalProducto[i]);
            System.out.println("");

        }
    }
}
private static void pedidoMayorTotal() {
        if (!pedidoRegistrado){
        System.out.println("No se han registrado pedidos");
    } else {

        double mayor = totalProducto[0];
        int posicionMayor = 0;


        for (int i=0; i<registro; i++){
            if(totalProducto[i]>=mayor){
                mayor = totalProducto[i];
                posicionMayor = i;
            }
        }

        System.out.println("\n.:Producto con mayor valor:");
        System.out.println("Cliente: " + nombreCliente[posicionMayor]);
        System.out.println("Producto: " + nombreProducto[posicionMayor]);
        System.out.println("Cantidad: " + cantidadSolicitada[posicionMayor]);
        System.out.println("Precio unitario: " + precioUnitario[posicionMayor]);
        System.out.printf("Total: $%.2f\n", mayor);
    }
}
private static void valorTotalGeneral() {
        if (!pedidoRegistrado){
        System.out.println("No se han registrado pedidos");
    } else {
        for (int i=0; i<registro; i++){
            valorGeneral += precioUnitario[i]*cantidadSolicitada[i];
        }

        System.out.println("Total del inventario: " + valorGeneral);

    }

}
private static void pedidoPorNombre(Scanner input) {
        boolean clienteEncontrado = false;

        if (!pedidoRegistrado){
        System.out.println("No se han registrado pedidos");
    } else {
        System.out.println("Ingrese el nombre del cliente para buscar el pedido");
        String cliente = input.nextLine();

        for (int i = 0; i<registro; i++){
            if (cliente.equalsIgnoreCase(nombreCliente[i])){
                clienteEncontrado = true;
                System.out.println("\nCliente encontrado:");
                System.out.println("Nombre: " + nombreCliente[i]);
                System.out.println("Producto solicitado: " + nombreProducto[i]);
                System.out.println("Cantidad solicitada: " + cantidadSolicitada[i]);
                System.out.println("Precio unitario: " + precioUnitario[i]);
        }
    }
        if (!clienteEncontrado){
        System.out.println("El pedido no fue encontrado");
        }
    }
    }
}

