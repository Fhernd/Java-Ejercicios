package ejercicio0000183;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Ejercicio 183: Usar la Clase Graphics para dibujar líneas en un objeto 
 * JPanel.
 * 
 * @author John Ortiz Ordoñez
 */
public class DibujoLineas extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.RED);
        g.drawLine(20, 20, 20, 120);
        
        g.setColor(Color.GREEN);
        g.drawLine(20, 20, 120, 20);
        
        g.setColor(Color.BLUE);
        g.drawLine(20, 20, 120, 120);
    }

    public static void main(String[] args) {
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Dibujando Líneas");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.WHITE);
        ventana.setSize(200, 200);
        
        DibujoLineas panel = new DibujoLineas();
        ventana.add(panel);
        
        ventana.setVisible(true);
    }
}
