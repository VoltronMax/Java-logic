import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        System.out.println("Ingrese el primer numero");
        double num1 = s.nextDouble();

        System.out.println("Ingrese el segundo numero");
        double num2 = s.nextDouble();

        System.out.println("Ingrese el tercer numero");
        double num3 = s.nextDouble();

        if (num1>=num2 && num1>=num3){
            System.out.println("El numero: " + num1 + " es el mayor de los tres");
        } else if (num2>=num1 && num2>=num3){
            System.out.println("El numero: " + num2 + " es el mayor de los 3");
        } else if (num3>num1 && num3>num2){
            System.out.println("El numero " + num3 + " es el mayor de los tres");
        } else {
            System.out.println("Error");
        }

        s.close();

    }
}
