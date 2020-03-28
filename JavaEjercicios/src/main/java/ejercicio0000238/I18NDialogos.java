package ejercicio0000238;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * Ejercicio 238: Crear un diálogo JOptionPane con recursos de traducción.
 * 
 * @author John Ortiz Ordoñez
 */
public class I18NDialogos extends JFrame{
    
    private static final long serialVersionUID = -5909445094692420547L;

    public I18NDialogos() throws HeadlessException {
        super("Uso Traducción JOptionPane");
        
        setLayout(new FlowLayout());
        
        ResourceBundle rb = ResourceBundle.getBundle("ejercicio0000238/Bundle");
        
        JButton btnSaludar = new JButton(rb.getString("app.greet"));
        btnSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                JOptionPane.showMessageDialog(I18NDialogos.this, rb.getString("app.greeting"), rb.getString("app.message"), JOptionPane.INFORMATION_MESSAGE);
            }
        });
        add(btnSaludar);
        
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
    
    public static void main(String[] args) {
        
        final I18NDialogos ventana = new I18NDialogos();
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                ventana.setVisible(true);
            }
        });
    }
}
