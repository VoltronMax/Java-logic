import java.util.Scanner;
public class Logica13 {

    public static void main(String[] args) {
        
        //Programa que detecta si un texto se lee igual de izquierda a derecha y viceversa

        var input = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        String palabra = input.nextLine();

        palabra = palabra.toLowerCase().replace("", "");

        String inverso = "";

        for (int i= palabra.length() - 1; i>=0; i--){
            inverso += palabra.charAt(i);
        }

        if (palabra.equals(inverso)){
            System.out.println("Su palabra es un palindromo");
        } else {
            System.out.println("Su palabra no es un palindromo");
        }


        input.close();
    }
    
}
