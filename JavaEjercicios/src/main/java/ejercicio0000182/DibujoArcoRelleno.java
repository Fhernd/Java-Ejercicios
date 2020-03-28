package ejercicio0000182;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Ejercicio 182: Usar la clase Graphics para dibujar un arco relleno en un 
 * objeto JPanel.
 * 
 * @author John Ortiz Ordoñez
 */
public class DibujoArcoRelleno extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setPaint(Color.DARK_GRAY);
        g2.fill(new Arc2D.Double(10, 10, 200, 100, 90, 180, Arc2D.OPEN));
    }
    
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Dibujando un Arco Relleno");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.white);
        ventana.setSize(300, 200);
        
        DibujoArcoRelleno panel = new DibujoArcoRelleno();
        ventana.add(panel);
        
        ventana.setVisible(true);
    }
}
