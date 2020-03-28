package ejercicio0000229;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 * Ejercicio 229: Ubicar una ventana JFrame en el centro de la pantalla.
 * 
 * @author John Ortiz Ordoñez
 */
public class VentanaCentroPantalla extends JFrame{

    private static final long serialVersionUID = -6608288758890424020L;

    public VentanaCentroPantalla() throws HeadlessException {
        super("JFrame en el centro");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        
        centrarVentana();
    }

    private void centrarVentana() {
        Dimension tamagnioVentana = getSize();
        Dimension tamagnioPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        
        int x = (tamagnioPantalla.width - tamagnioVentana.width) / 2;
        int y = (tamagnioPantalla.height - tamagnioVentana.height) / 2;
        
        setLocation(x, y);
    }
    
    public static void main(String[] args) {
        
        final VentanaCentroPantalla ventana = new VentanaCentroPantalla();
        
        EventQueue.invokeLater(() -> {
            ventana.setVisible(true);
        });
    }
}
