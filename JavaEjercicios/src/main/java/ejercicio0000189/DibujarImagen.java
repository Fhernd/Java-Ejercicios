package ejercicio0000189;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Ejercicio 189: Dibujar una imagen en un componente JPanel.
 * 
 * @author John Ortiz Ordoñez
 */
public class DibujarImagen extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        final String NOMBRE_IMAGE = "java-logo.png";
        
        try {
            
            BufferedImage imagen = ImageIO.read(new File(NOMBRE_IMAGE));
            
            g.drawImage(imagen, 0, 0, this);
            
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Dibujando Imagen");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.WHITE);
        ventana.setSize(300, 300);
        
        DibujarImagen panel = new DibujarImagen();
        ventana.add(panel);
        
        ventana.setVisible(true);
    }
}
