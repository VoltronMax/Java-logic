import java.util.*;
public class Logica17 {

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        var prom = 0.0;
        var bcero = 0.0;

        System.out.println("Ingrese por cuantos dias se registrara la temperatura");
        int temp = input.nextInt();

        double[]registroTemp = new double[temp];


        for (int i=0; i<temp; i++){
            System.out.println("Ingrese la temperatura del dia #" + (i+1));
            registroTemp[i] = input.nextDouble();
            while (registroTemp[i]<-50 || registroTemp[i]>60) {
                System.out.println("Valor erroneo, ingrese nuevamente");
                registroTemp[i] = input.nextDouble();
            }
            }

            double tempMax = registroTemp[0];
            double tempMin = registroTemp[0];

        for (int j=0; j<temp; j++){
            double actual = registroTemp[j];

            if (actual<0){
            bcero++;
            }

            if (actual>tempMax){
                tempMax= actual;
            }
            if (actual<tempMin){
                tempMin = actual;
            }

            prom+=actual;

        }

        prom/=temp;

        System.out.println("\n--- Resultados brrr ---");
        System.out.println("Temperatura max registrada: " + tempMax);
        System.out.println("Temperatura min registrada: " + tempMin);
        System.out.println("Dias con temperatura bajo cero: " + (int)bcero);
        System.out.printf("Temperatura promedio: %.2f", + prom);

        
        input.close();
        
    }
    
}
