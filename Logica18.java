import java.util.*;
public class Logica18 {

    public static void main(String[] args) {

        //Programa que registra estudiantes por su nombre, edad, nota y grado. Al final, da un resumen por estudiante y estadisticas generales

            var input = new Scanner(System.in);

            System.out.println("Mijo, ingrese cuantos estudiantes va a registrar");
            int estudiantes = input.nextInt();
            input.nextLine();

            String[]nombres = new String[estudiantes];
            int[]edad = new int[estudiantes];
            double[]nota = new double[estudiantes];
            int []grado = new int[estudiantes];

            double promedio = 0.0;
            int apro = 0;
            int repro = 0;
            

            for (int i=0; i<estudiantes; i++){

                System.out.println("Ingrese el nombre del estudiante: #" + (i+1));
                nombres[i] = input.nextLine();

                System.out.println("Ingrese la edad de dicho estudiante");
                edad[i] = input.nextInt();
                while (edad[i]<6 || edad[i]>100) {
                    System.out.println("Edad erronea, ingresela nuevamente");
                    edad[i] = input.nextInt();
                }
                input.nextLine();

                System.out.println("Ingrese la calificacion final del estudiante");
                nota[i] = input.nextDouble();
                while (nota[i]<0.0 || nota[i]>5.0) {
                    System.out.println("Nota invalida, ingrese nuevamente");
                    nota[i] = input.nextDouble();
                }
                input.nextLine();

                promedio+=nota[i];

                if (nota[i]>=3.0){
                    apro++;
                } else {
                    repro++;
                }

                System.out.println("Ingrese el grado del estudiante");
                grado[i]= input.nextInt();
                while (grado[i]<6 || grado[i]>11) {
                    System.out.println("Ingrese un grado valido");
                    grado[i] = input.nextInt();
                }
                input.nextLine();

            }

            System.out.println("\n ---------- Resumen de estudiantes -------------");
            for(int j=0; j<estudiantes; j++){
                System.out.println("Nombre: " + nombres[j]);
                System.out.println("Edad: " + edad[j]);
                System.out.println("Grado: " +  grado[j]);
                System.out.println("Nota : " + (nota[j]>3.0 ? "Paso" : "Yaper"));
                System.out.println("----------------------------------------------");

            }
            System.out.println("\n");
            System.out.println("Total de estudiantes: " + estudiantes);
            System.out.println("Aprobados: " + apro);
            System.out.println("Yaperdieron: " + repro);
            System.out.printf("Promedio de notas: %.2f\n", promedio/estudiantes);


            input.close();
        
    }



    
}
