package ejercicio0000185;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Ejercicio 185: Usar la clase Graphics para dibujar puntos sobre un objeto 
 * JPanel.
 * 
 * @author John Ortiz Ordoñez
 */
public class DibujoPuntos extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.BLACK);
        g.drawLine(20, 20, 20, 20);
        g.drawLine(30, 30, 30, 30);
        
        g.setColor(Color.RED);
        g.drawLine(50, 50, 50, 50);
        g.drawLine(80, 80, 80, 80);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Dibujando Puntos");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.WHITE);
        ventana.setSize(200, 200);
        
        DibujoPuntos panel = new DibujoPuntos();
        ventana.add(panel);
        
        ventana.setVisible(true);
    }
}
