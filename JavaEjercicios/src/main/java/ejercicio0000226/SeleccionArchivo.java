package ejercicio0000226;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * Ejercicio 226: Usar el componente JFileChooser para seleccionar un 
 * archivo.
 * 
 * @author John Ortiz Ordoñez
 */
public class SeleccionArchivo extends JFrame{

    private static final long serialVersionUID = -108299984036803094L;

    public SeleccionArchivo() throws HeadlessException {
        super("Uso JFileChooser");
        
        setLayout(new FlowLayout());
        
        JButton btnSeleccionarArchivo = new JButton("Seleccionar archivo...");
        add(btnSeleccionarArchivo);
        
        JFileChooser jfcSelectorArchivo = new JFileChooser();
        
        btnSeleccionarArchivo.addActionListener((ActionEvent e) -> {
            
            int resultado = jfcSelectorArchivo.showOpenDialog(this);
            
            if (resultado == JFileChooser.APPROVE_OPTION){
                File archivo = jfcSelectorArchivo.getSelectedFile();
                
                JOptionPane.showMessageDialog(this, "Ud. seleccionó el archivo " + archivo.getName());
                
            } else {
                JOptionPane.showMessageDialog(this, "No se seleccionó ningún archivo.");
            }
        });
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(300, 200);
    }

    public static void main(String[] args) {
        
        final SeleccionArchivo ventana = new SeleccionArchivo();
        
        SwingUtilities.invokeLater(() -> {
            ventana.setVisible(true);
        });
    }
}
