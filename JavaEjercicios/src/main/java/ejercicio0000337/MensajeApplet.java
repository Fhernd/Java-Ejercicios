package ejercicio0000337;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * Ejercicio 337: Crear un applet para alternar la visualización de un mensaje.
 * 
 * @author John Ortiz Ordoñez
 */
@SuppressWarnings("serial")
public class MensajeApplet extends JApplet{

    private boolean visible;
    private JLabel lblMensaje;
    
    @Override
    public void init(){
        JButton btnAlternarVisualizacionMensaje = new JButton("Mostrar/Ocultar");
        lblMensaje = new JLabel("¡Hola!");
        visible = false;
        
        Container contenedor = (Container) getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        btnAlternarVisualizacionMensaje.addActionListener(((e) -> {
            visible = !visible;
            
            alternarMensaje();
        }));
        contenedor.add(btnAlternarVisualizacionMensaje);
        contenedor.add(lblMensaje);
    }

    private void alternarMensaje() {
        if(visible){
            lblMensaje.setText("¡Hola!");
        } else {
            lblMensaje.setText("¡Hasta pronto!");
        }
    }
}
