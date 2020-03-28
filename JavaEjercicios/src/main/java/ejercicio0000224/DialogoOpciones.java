package ejercicio0000224;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Ejercicio 224: Crear un diálogo con JOptionPane para seleccionar una opción.
 * 
 * @author John Ortiz Ordoñez
 */
public class DialogoOpciones extends JFrame{

    private static final long serialVersionUID = 6556522915375617712L;

    public DialogoOpciones() throws HeadlessException {
        super("Selección Opción");
        
        setLayout(new GridLayout(2, 1));
        
        JButton btnSeleccionarOpcion = new JButton("Seleccionar opción");
        add(btnSeleccionarOpcion);
        
        JLabel lblSeleccion = new JLabel();
        add(lblSeleccion);
        
        btnSeleccionarOpcion.addActionListener((ActionEvent e) -> {
            
            String[] ides = {"NetBeans IDE", "Eclipse", "IntelliJ IDEA", "BlueJ", "Visual Studio Code"};
            
            int opcionSeleccionada = JOptionPane.showOptionDialog(this, "Seleccione su IDE favorito", "Mensaje", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, ides, ides[0]);
            
            lblSeleccion.setText("Su IDE favorito es: " + 
                    ides[opcionSeleccionada]);
        });
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(350, 200);
    }

    public static void main(String[] args) {
        
        DialogoOpciones ventana = new DialogoOpciones();
        
        EventQueue.invokeLater(() -> {
            ventana.setVisible(true);
        });
    }
}
