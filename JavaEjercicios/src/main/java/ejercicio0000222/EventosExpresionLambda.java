package ejercicio0000222;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * Ejercicio 222: Usar una expresión lambda para responder a eventos de click 
 * de un botón.
 * 
 * @author John Ortiz Ordoñez
 */
public class EventosExpresionLambda extends JFrame{

    private static final long serialVersionUID = 2828675227433186671L;

    public EventosExpresionLambda() throws HeadlessException {
        super("Usando Expresión Lambda");
        
        setLayout(new FlowLayout());
        
        JButton btnSaludar = new JButton("Saludar");
        add(btnSaludar);
        
        btnSaludar.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(EventosExpresionLambda.this, "¡Hola!");
        });
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(350, 200);
    }

    public static void main(String[] args) {
        
        final EventosExpresionLambda ventana = 
                new EventosExpresionLambda();
        
        SwingUtilities.invokeLater(() -> {
            ventana.setVisible(true);
        });
    }
}
