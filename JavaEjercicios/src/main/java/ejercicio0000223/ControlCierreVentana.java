package ejercicio0000223;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 * Ejercicio 223: Usar la clase WindowAdapter para controlar el cierre 
 * de una ventana.
 * 
 * @author John Ortiz Ordoñez
 */
public class ControlCierreVentana extends JFrame{
    
    private static final long serialVersionUID = -2746313776694664632L;

    public ControlCierreVentana() throws HeadlessException {
        super("Uso de WindowAdapter");
        
        setSize(200, 200);
        
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        
        addWindowListener(new VentanaAdaptadora());
    }
    
    class VentanaAdaptadora extends WindowAdapter{
        
        @Override
        public void windowClosing(WindowEvent e){
            JOptionPane.showMessageDialog(null, "La ventana está a punto de cerrarse. La aplicación también finalizará.");
            
            ControlCierreVentana.this.setVisible(false);
            ControlCierreVentana.this.dispose();
            
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        
        final ControlCierreVentana ventana = new ControlCierreVentana();
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ventana.setVisible(true);
            }
        });
    }
}
