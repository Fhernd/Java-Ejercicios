package ejercicio0000212;

import java.awt.Container;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Ejercicio 212: Usar un objeto Container para mostrar un texto en un objeto 
 * JFrame.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoContenedor extends JFrame{

    private static final long serialVersionUID = -3582677847300410161L;

    public UsoContenedor() throws HeadlessException {
        
        Container contenedor = getContentPane();
        
        JLabel lblTexto = new JLabel("¡Java es tremendo!", JLabel.CENTER);
        contenedor.add(lblTexto);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new UsoContenedor();
    }
}
