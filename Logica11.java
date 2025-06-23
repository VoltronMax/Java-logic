import java.util.Scanner;
public class Logica11 {
    public static void main(String[] args) {

        //Programa con menu para seleccion de operacion aritmetica entre dos numeros
        var input = new Scanner(System.in);

            System.out.println("Ingrese dos numeros");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

        System.out.println("--------------------------------------");
        System.out.println("1. Para sumar los dos numeros");
        System.out.println("2. Para restar los dos numeros");
        System.out.println("3. Para multiplicar los dos numeros");
        System.out.println("4. Para dividir los dos numeros");
        System.out.println("--------------------------------------");

        int opcion = input.nextInt();

        switch (opcion) {

            case 1:
            var suma = num1+num2;
            System.out.println(suma);
            break;

            case 2:
            var resta = num1-num2;
            System.out.println(resta);
            break;

            case 3:
            var mult = num1*num2;
            System.out.println(mult);
            break;

            case 4:

            if (num2!=0) {
            var division = num1/num2;
            System.out.println(division);
            } else {
                System.out.println("No se puede dividir entre 0");
            }
            break;

        
            default:
            System.out.println("Opcion invalida");
                break;
        }




        
        input.close();
    }
    
}
