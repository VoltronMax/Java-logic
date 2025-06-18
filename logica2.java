import javax.swing.JOptionPane;
public class logica2 {

    public static void main(String[] args) {

        int cont=0;

        for (int i=0; i<=100; i++)

        if (i%2==0){

            cont+=i;

        }

        JOptionPane.showMessageDialog(null, "Resultado: " + cont, "Suma", JOptionPane.INFORMATION_MESSAGE);

        
    }
    
}
