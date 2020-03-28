package ejercicio0000217;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * Ejercicio 217: Hacer uso del layout GridLayout para crear un formulario 
 * de inicio de sesión.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoGridLayout extends JFrame{
    
    private static final long serialVersionUID = 4657185643286985053L;

    public UsoGridLayout() throws HeadlessException {
        super("Uso GridLayout");
        
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        LayoutManager layout = new GridLayout(3, 2, 5, 5);
        setLayout(layout);
        
        add(new JLabel("Usuario:"));
        add(new JTextField());
        add(new JLabel("Contraseña:"));
        add(new JPasswordField());
        add(new JLabel());
        add(new JButton("Iniciar Sesión"));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300, 300);
        pack();
        setSize(350, 150);
    }
    
    public static void main(String[] args) {
        
        final UsoGridLayout ventana = new UsoGridLayout();
        
        SwingUtilities.invokeLater(() -> {
            ventana.setVisible(true);
        });
    }
}
