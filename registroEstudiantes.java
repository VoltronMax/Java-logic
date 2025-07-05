import java.util.*;
public class registroEstudiantes {
    static String nombre = "N/A";
    static double nota, nota1, nota2;
    
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        crearMenu(input);
        System.out.println(nombre);
    }

    private static void crearMenu(Scanner input){


        var salida = false;
        do{
            System.out.println("---Sistema de registro de estudiantes---\n");
            System.out.println("""
                1. Registrar datos
                2. Mostrar datos del estudiante actual
                3. Calcular promedio de notas del estudiante actual
                0. salir
                    """);
            var opcion = sca(input, "Ingrese su opcion");
            input.nextLine();

            switch (opcion) {
                case 1:
                registrarEstudiante(input, nombre);
                    break;
                case 2:
                mostrarInformacion(nombre, nota, nota1, nota2);
                    break;
                case 3:
                promedioNotas(nota, nota1, nota2);
                    break;
                case 0:
                    System.out.println("Saliendo");
                    salida = true;
                break;
            
                default:
                System.out.println("Opcion invalida, ingrese nuevamente");
                    break;
            }


        } while (!salida);
        System.out.println("Hasta luego");
        }

    private static int sca(Scanner input, String mensaje){
        System.out.println(mensaje);
        var entrada = input.nextInt();
        return entrada;
    }

    private static String leerNombre(Scanner input, String mensaje){
        System.out.println(mensaje);
        var nombre = input.nextLine();
        return nombre;
    }

    private static double leerNota(Scanner input, String mensaje){
        System.out.println(mensaje);
        var entrada = input.nextDouble();
        return entrada;
    }

    private static void registrarEstudiante (Scanner input, String mensaje){
        nombre = leerNombre(input, "Ingrese el nombre del estudiante");
        nota = leerNota(input, "Ingrese la primera nota");
        nota1 = leerNota(input, "Ingrese la segunda nota");
        nota2 = leerNota(input, "Ingrese la tercera nota");
    }

    private static void mostrarInformacion (String nombre, double nota1, double nota2, double nota3){
        System.out.println("Nombre :" + nombre);
        System.out.println("Notas: \n" + nota1);
        System.out.println(nota2);
        System.out.println(nota3);
    }

    private static void promedioNotas(double nota, double nota1, double nota2){
        var acum = nota+nota1+nota2;
        var promedio = acum/3;
        System.out.printf("El promedio de notas del estudiante es %.2f:\n", promedio);
    }

    

}

