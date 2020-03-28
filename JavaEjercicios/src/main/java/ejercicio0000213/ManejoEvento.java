package ejercicio0000213;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Ejercicio 213: Crear un event handler para controlar el cierre de una 
 * aplicación.
 * 
 * @author John Ortiz Ordoñez
 */
public class ManejoEvento extends JFrame{
    
    private JButton btnCerrar;

    public ManejoEvento() throws HeadlessException {
        super("Manejo Eventos");
        
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        btnCerrar = new JButton("Cerrar");
        contenedor.add(btnCerrar);
        
        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                setVisible(false);
                dispose();
                System.exit(0);
            }
        });
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocation(500, 500);
        setSize(400, 400);
    }
    
    public static void main(String[] args) {
        
        new ManejoEvento().setVisible(true);
    }
}
