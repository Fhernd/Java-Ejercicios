package ejercicio0000225;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SwingUtilities;

/**
 * Ejercicio 225: Usar un componente JSpinner para mostrar opciones de fecha 
 * y cadenas de caracteres.
 * 
 * @author John Ortiz Ordoñez
 */
public class FechasOpcionesJSpinner extends JFrame{

    private static final long serialVersionUID = -7779315597029804930L;

    public FechasOpcionesJSpinner() throws HeadlessException {
        super("Uso JSpinner");
        
        setLayout(new GridLayout(0, 1));
        
        // Agregación JSpinner para opciones de fecha:
        JSpinner spnFechas = new JSpinner(new SpinnerDateModel());
        add(spnFechas);
        
        // JSpinner para opciones de objetos String:
        String[] ides = {"NetBeans IDE", "Eclipse", "IntelliJ IDEA", "Visual Studio Code"};
        JSpinner spnStrings = new JSpinner(new SpinnerListModel(ides));
        add(spnStrings);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(200, 150);
    }

    public static void main(String[] args) {
        
        FechasOpcionesJSpinner ventana = new 
            FechasOpcionesJSpinner();
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ventana.setVisible(true);
            }
        });
    }
}
