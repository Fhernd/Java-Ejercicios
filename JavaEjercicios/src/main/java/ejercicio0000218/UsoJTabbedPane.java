package ejercicio0000218;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

/**
 * Ejercicio 218: Hacer uso de la clase JTabbedPane para crear GUI basada 
 * en pestañas.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoJTabbedPane {
    
    private JTabbedPane tpnTabs;

    public UsoJTabbedPane() {
        
        tpnTabs = new JTabbedPane();
        
        tpnTabs.add(new JLabel("Contenido pestaña 1", JLabel.CENTER), 
                "Pestaña 1");
        tpnTabs.add(new JLabel("Contenido pestaña 2", JLabel.CENTER), 
                "Pestaña 2");
    }

    public JTabbedPane getTpnTabs() {
        return tpnTabs;
    }

    public void setTpnTabs(JTabbedPane tpnTabs) {
        this.tpnTabs = tpnTabs;
    }
    
    
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Uso JTabbedPane");
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                ventana.getContentPane()
                        .add(new UsoJTabbedPane().getTpnTabs());
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setSize(350, 200);
                ventana.setVisible(true);
            }
        });
    }
}
