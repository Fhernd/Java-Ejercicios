package ejercicio0000186;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Ejercicio 186: Usar la clase Graphics para dibujar un Polígono sobre un 
 * objeto JPanel.
 * 
 * @author John Ortiz Ordoñez
 */
public class DibujoPoligonos extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int[] x = {50, 50, 90, 90, 150, 90, 90};
        int[] y = {55, 85, 85, 110, 70, 30, 55};
        
        g.setColor(Color.ORANGE);
        g.drawPolygon(x, y, 7);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Dibujando Polígonos");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.WHITE);
        ventana.setSize(300, 200);
        
        DibujoPoligonos panel = new DibujoPoligonos();
        ventana.add(panel);
        
        ventana.setVisible(true);
    }
}
