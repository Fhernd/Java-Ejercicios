package ejercicio0000022;

import javax.swing.JOptionPane;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class CapturaJOptionPane {
    public static void main(String[] args){
        String nombre;
        
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        
        JOptionPane.showMessageDialog(null, "Bienvenido, " + nombre);
    }
}
