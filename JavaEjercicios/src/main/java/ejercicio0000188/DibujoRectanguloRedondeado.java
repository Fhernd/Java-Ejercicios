package ejercicio0000188;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Ejercicio 188: Usar la clase Graphics para dibujar un rectángulo 
 * redondeado sobre un objeto JPanel.
 * 
 * @author John Ortiz Ordoñez
 */
public class DibujoRectanguloRedondeado extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawRoundRect(20, 10, 250, 300, 25, 25);
    }
    
    
    public static void main(String[] args) {
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Dibujo Rectángulo Redondeado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.WHITE);
        frame.setSize(300, 350);
        
        DibujoRectanguloRedondeado panel = new DibujoRectanguloRedondeado();
        frame.add(panel);
        
        frame.setVisible(true);
    }
}
