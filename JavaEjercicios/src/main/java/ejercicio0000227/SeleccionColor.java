package ejercicio0000227;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Ejercicio 227: Usar el componente JColorChooser para la selección de un 
 * color.
 * 
 * @author John Ortiz Ordoñez
 */
public class SeleccionColor extends JFrame{

    private static final long serialVersionUID = -8746298806024881544L;

    public SeleccionColor() throws HeadlessException {
        super("Uso JColorChooser");
        setLayout(new BorderLayout());
        
        JButton btnSeleccionarColor = new JButton("Seleccionar color...");
        btnSeleccionarColor.setToolTipText("Click aquí para cambiar el color.");
        add(btnSeleccionarColor, BorderLayout.NORTH);
        
        JLabel lblTexto = new JLabel("¡Java es Tremendo!", JLabel.CENTER);
        lblTexto.setToolTipText("Este es el último color seleccionado.");
        add(lblTexto, BorderLayout.SOUTH);
        
        btnSeleccionarColor.addActionListener(((e) -> {
            
            Color colorSeleccionado = JColorChooser.showDialog(this, "Escoja un color", lblTexto.getForeground());
            
            if (colorSeleccionado != null){
                lblTexto.setForeground(colorSeleccionado);
                lblTexto.repaint();
            }
        }));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(300, 200);
    }

    public static void main(String[] args) {
        
        final SeleccionColor ventana = new SeleccionColor();
        
        EventQueue.invokeLater(() -> {
            ventana.setVisible(true);
        });
    }
}
