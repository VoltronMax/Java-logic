import java.util.*;
public class controlClientes {
    static String[] nombreCliente;
    static String[] correoElectronico;
    static String[] numeroTelefono;
    static int clientes;
    static boolean clienteRegistrado = false;


    public static void main(String[] args) {
        var input = new Scanner(System.in);
        mostrarMenu(input);
    }

    private static void mostrarMenu(Scanner input) {

        var salida = false;
        do{
            System.out.println(".:Bienvenido al sistema de registro de clientes:.");
            System.out.println("""
                1. Para registrar
                2. Para mostrar clientes registrados
                3. Para buscar cliente por nombre
                4. Para salir
                    """);

                System.out.println("Ingrese la opcion deseada");
                int opcion = input.nextInt();
                input.nextLine();

                switch (opcion) {
                    case 1:
                    registrarClientes(input);
                        break;

                    case 2:
                    mostrarClientesRegistrados();

                    break;

                    case 3:
                    buscarClientePorNombre(input);
                    break;

                    case 4:
                    System.out.println("Saliendo...");
                    salida = true;
                
                    default:
                    System.out.println("Ingrese una opcion valida");
                        break;
                }
        } while (!salida);
        System.out.println("Hasta pronto");

    }

    private static void buscarClientePorNombre(Scanner input) {


    }

    private static void mostrarClientesRegistrados() {
        if (!clienteRegistrado){
            System.out.println("No se ha registrado ningun cliente");
        } else {

            System.out.println(".:Clientes registrados:.");
            for (int i = 0; i<clientes; i++){
                System.out.println("\n======================================");
                System.out.println("Cliente #" + (i+1));
                System.out.println("Nombre: " + nombreCliente[i]);
                System.out.println("Correo: " + correoElectronico[i]);
                System.out.println("Telefono: " + numeroTelefono[i]);
                System.out.println("=======================================\n");

            }
        }

    }

    private static void registrarClientes(Scanner input) {

        System.out.println("\n Registro de clientes");
        do{
        System.out.println("Ingrese cuantos clientes desea registrar");
        clientes = input.nextInt();
        input.nextLine();
        if (clientes<=0){
            System.out.println("Debe ingresar un numero existente de clientes");
        }
        } while(clientes<=0);

        nombreCliente = new String[clientes];
        correoElectronico = new String[clientes];
        numeroTelefono = new String[clientes];

        int i;
        for (i=0; i<clientes; i++){
            System.out.println("\n Datos del cliente #" + (i+1));
            nombreCliente [i] = validarCampo(input, "Ingrese el nombre");
            correoElectronico[i] = validarCampo(input, "Ingrese el correo del cliente");
            numeroTelefono[i] = validarCampo(input, "Ingrese el telefono del cliente");  
        }

        clienteRegistrado = true;
        
    }

    private static String validarCampo(Scanner input, String mensaje){
        String campo;
        do{
            System.out.println(mensaje);
            campo = input.nextLine();
            if (campo.isBlank()){
            System.out.println("Debe ingresar un texto");
        }
        } while (campo.isBlank());
        return campo;
            
        }

    }
    

