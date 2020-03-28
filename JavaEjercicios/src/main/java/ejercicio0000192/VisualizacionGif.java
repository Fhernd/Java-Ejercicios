package ejercicio0000192;

import java.io.IOException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Ejercicio 192: Reproducir una animación GIF con un JLabel.
 * 
 * @author John Ortiz Ordoñez
 */
public class VisualizacionGif {

    public static void main(String[] args) throws IOException{
        
        final String IMAGEN = "https://www.dropbox.com/s/bew95oplydxobuk/animacion.gif?dl=1";
        
        URL urlGif = new URL(IMAGEN);
        Icon iconGif = new ImageIcon(urlGif);
        JLabel animacionGif = new JLabel(iconGif);
        
        JFrame ventana = new JFrame("Visualizando GIF");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.getContentPane().add(animacionGif);
        ventana.setSize(400, 400);
        
        ventana.setVisible(true);
    }
}
