import java.util.*;
public class calcualdora {
    public static void main(String[] args) {

    var input = new Scanner (System.in);

    crearMenu(input);

    input.close();
    }

    public static void crearMenu(Scanner input){
        var salir = false;
        do {
            System.out.println("\n.:Bienvenido a la calculadora modular:.\n");
            System.out.println("""
                1. Para sumar
                2. Para restar
                3. Para multiplicar
                4. Para dividir
                5. Para residuo de la division
                0. Para salir
                    """);
                var opcion = leerEntero(input, "Ingrese la opcion");
            switch (opcion) {
                case 1:
                suma(input);
                    break;
                case 2:
                resta(input);
                    break;
                case 3:
                multiplicacion(input);
                    break;
                case 4:
                division(input);
                    break;
                case 5:
                modulo(input);
                    break;
                case 0:
                System.out.println("Saliendo");
                salir = true;
                break;
                default:
                System.out.println("Opcion invalida");
                    break;
            }

        } while (!salir);
        System.out.println("Hasta luego!");
    }

    private static int leerEntero(Scanner input, String mensaje){
        System.out.println(mensaje);
        var entrada = input.nextInt();
        input.nextLine();

        return entrada;
    }

    private static void suma(Scanner input){
        System.out.println("\n.:Suma:.\n");

        var num1 = leerEntero(input, "Ingrese el primer operando");
        var num2 = leerEntero(input, "Ingrese el segundo operando");

        var resultado = num1+num2;

        System.out.printf("La suma es de %,d%n", resultado);
    }

    private static void resta(Scanner input){
        System.out.println("\n.:Resta:.\n");

        var num1 = leerEntero(input, "Ingrese el primer operando");
        var num2 = leerEntero(input, "Ingrese el segundo operando");

        var resultado = num1-num2;

        System.out.printf("La resta es de %,d%n", resultado);
    }

    private static void multiplicacion(Scanner input){
        System.out.println("\n .:Multiplicacion:. \n");

        var num1 = leerEntero(input, "Ingrese el primer operando");
        var num2 = leerEntero(input, "Ingrese el segundo operando");

        var resultado = num1*num2;

        System.out.printf("La multiplicacion es de %,d%n", resultado);
    }

    private static void division(Scanner input){
        System.out.println("\n Division \n");

        var num1 = leerEntero(input, "Ingrese el primer operando");
        var num2 = leerEntero(input, "Ingrese el segundo operando");
        while (num2==0){
            num2 = leerEntero(input, "El divisor no puede ser cero, ingrese nuevamente");
        }

        var resultado = num1/num2;

        System.out.printf("La division es de %,d%n", resultado);
    }

    private static void modulo(Scanner input){
        System.out.println("\n.:Modulo:.\n");

        var num1 = leerEntero(input, "Ingrese el primer operando");
        var num2 = leerEntero(input, "Ingrese el segundo operando");
        while (num2==0){
            num2 = leerEntero(input, "El divisor no puede ser cero, ingrese nuevamente");
        }
        var resultado = num1%num2;

        System.out.printf("El modulo de la division es de %,d%n", resultado);
    }
}

