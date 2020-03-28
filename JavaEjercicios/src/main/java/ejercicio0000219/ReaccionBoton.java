package ejercicio0000219;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * Ejercicio 219: Usar la interfaz ActionListener para reaccionar al evento 
 * de click de un botón.
 * 
 * @author John Ortiz Ordoñez
 */
public class ReaccionBoton extends JFrame implements ActionListener{

    private JButton btnSaludar;

    public ReaccionBoton() throws HeadlessException {
        super("Reacción Botón");
        
        setLayout(new FlowLayout());
        
        btnSaludar = new JButton("Saludar");
        btnSaludar.addActionListener(this);
        add(btnSaludar);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "¡Bienvenido a Java", "Mensaje",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        
        final ReaccionBoton ventana = new ReaccionBoton();
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ventana.setVisible(true);
            }
        });
    }
}
