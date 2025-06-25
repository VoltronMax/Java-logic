import java.util.Scanner;
public class AnalizadorNumeros {
    public static void main(String[] args) {

        //Programa tipo menu para analizar un numero, o generar una secuencia de numeros

        var input = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---Analizador de numeros y secuencias---");
            System.out.println("1. Analizar un solo numero");
            System.out.println("2. Generar secuencia de numeros");
            System.out.println("0. Salir");
            System.out.println("-----------------------------------------");
            System.out.print("Seleccione una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido analizar un solo numero");

                    System.out.print("Ingrese un numero entero: ");
                    int num = input.nextInt();

                    if (num > 0) {
                        System.out.println("El numero ingresado: " + num + " es positivo");
                    } else if (num < 0) {
                        System.out.println("El numero ingresado: " + num + " es negativo");
                    } else {
                        System.out.println("El numero es cero");
                    }

                    System.out.println("");

                    String par = (num % 2 == 0) ? "par" : "impar";
                    System.out.println("El numero es " + par);

                    System.out.println("");

                    if (num > 100) {
                        System.out.println("El numero: " + num + " es mayor que 100");
                    } else if (num < 100) {
                        System.out.println("El numero: " + num + " es menor a 100");
                    } else {
                        System.out.println("El numero es igual a 100");
                    }
                    break;

                case 2:
                    System.out.println("Ha elegido generar una secuencia de numeros");
                    System.out.print("Ingrese un numero inicial: ");
                    int ini = input.nextInt();
                    System.out.print("Ingrese un numero final: ");
                    int fin = input.nextInt();
                    input.nextLine();
                    System.out.print("Ingrese 'par' o 'impar' para generar la secuencia: ");
                    String opc = input.nextLine().toLowerCase();

                    if (opc.equals("par")) {
                        for (int i = ini; i <= fin; i++) {
                            if (i % 2 == 0) {
                                System.out.println(i);
                            }
                        }
                    } else if (opc.equals("impar")) {
                        for (int j = ini; j <= fin; j++) {
                            if (j % 2 != 0) {
                                System.out.println(j);
                            }
                        }
                    } else {
                        System.out.println("Opción inválida");
                    }
                    break;

                case 0:
                    System.out.println("Chao");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

            System.out.println();
        } while (opcion != 0);

        input.close();
    }
}
