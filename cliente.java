class cliente {
    String nombre;
    String correo;
    String telefono;
    void mostrarDatos(){
        System.out.println("Nombre: " + nombre + "\n Correo electronico: " + correo + "\n telefono: " + telefono);
    }

    public class Main{
        public static void main(String[] args) {
            cliente cliente = new cliente();
            cliente.nombre = "Pepe";
            cliente.correo = "pepitoelmascapito@gmail.com";
            cliente.telefono = "3102843321";
            cliente.mostrarDatos();

            cliente uncliente = new cliente();
            uncliente.nombre = "juancho";
            uncliente.correo = "juanchochenchogomez@outlook.com";
            uncliente.telefono = "3129234872";
            uncliente.mostrarDatos();
        }
    }
    
}



