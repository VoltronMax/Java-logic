public class logica6 {

    public static void main(String[] args) {

        //Crear un programa que sume los numeros pares del 0 al 100
        
        int acumulador = 0;

        for (int i=0; i<=100; i++){
            if (i%2==0){
                acumulador+=i;
            }
        }

        System.out.println("La suma de los numeros pares entre 0 y 100 es: " + acumulador);
    }
    
}
