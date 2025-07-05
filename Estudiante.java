class Estudiante {

    String nombre;
    int edad;
    double notaFinal;

    void mostrarInfo(){
        System.out.println("Su nombre es " + nombre + ", tiene " + edad + " años, y su nota es de: " + notaFinal);
    }

    public class Main{
        public static void main(String[] args) {
            Estudiante unEstudiante = new Estudiante();
            unEstudiante.nombre = "Andres";
            unEstudiante.edad = 12;
            unEstudiante.notaFinal = 3.0;
            unEstudiante.mostrarInfo();

            Estudiante otroEstudiante = new Estudiante();
            otroEstudiante.nombre = "Paula";
            otroEstudiante.edad = 13;
            otroEstudiante.notaFinal = 5.0;
            otroEstudiante.mostrarInfo();

            }
    }
}

