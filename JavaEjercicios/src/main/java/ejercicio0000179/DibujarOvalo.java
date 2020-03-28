package ejercicio0000179;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Ejercicio 179: Usar la clase Graphics para dibuar óvalos en un panel.
 * 
 * @author John Ortiz Ordoñez
 */
public class DibujarOvalo extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawOval(10, 10, 100, 100);
        
        g.drawOval(150, 50, 200, 100);
    }

    public static void main(String[] args) {
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Dibujo de Óvalos");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.white);
        ventana.setSize(400, 250);
        
        DibujarOvalo ovalos = new DibujarOvalo();
        ventana.add(ovalos);
        
        ventana.setVisible(true);
    }
}
