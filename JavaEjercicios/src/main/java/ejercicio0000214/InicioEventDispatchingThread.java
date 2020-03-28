package ejercicio0000214;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Ejercicio 214: Lanzar una interfaz gráfica de usuario sobre Event 
 * Dispatching Thread usando EventQueue.invokeLater.
 * 
 * @author John Ortiz Ordoñez
 */
public class InicioEventDispatchingThread {

    public static void main(String[] args) {
        
        DemoGUI ventana = new DemoGUI();
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                ventana.setVisible(true);
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
