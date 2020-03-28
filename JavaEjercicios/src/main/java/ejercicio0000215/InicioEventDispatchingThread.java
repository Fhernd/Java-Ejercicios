package ejercicio0000215;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 * Ejercicio 215: Lanzar una interfaz gráfica de usuario sobre Event 
 * Dispatching Thread usando SwingUtilities.invokeLater.
 * 
 * @author John Ortiz Ordoñez
 */
public class InicioEventDispatchingThread {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new DemoGUI().setVisible(true);
            }
        });
    }
}

class DemoGUI extends JFrame{
    
    private static final long serialVersionUID = -6384466481186907926L;

    public DemoGUI() throws HeadlessException {
        
        JLabel lblTexto = new JLabel("¡Java es tremendo!", JLabel.CENTER);
        add(lblTexto);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
    }
}
