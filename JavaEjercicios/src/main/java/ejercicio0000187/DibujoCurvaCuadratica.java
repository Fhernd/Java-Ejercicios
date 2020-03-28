package ejercicio0000187;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Ejercicio 187: Usar la clase Graphics para dibujar una curva cuadrática 
 * sobre un objeto JPanel.
 * 
 * @author John Ortiz Ordoñez
 */
public class DibujoCurvaCuadratica extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Dibujo de ejes:
        g.drawLine(10, 100, 290, 100);
        g.drawLine(150, 10, 150, 190);
        
        // Curva cuadrática:
        g.setColor(Color.RED);
        Path2D ruta = new Path2D.Double();
        ruta.moveTo(50, 150);
        ruta.quadTo(150, 0, 250, 100);
        
        Graphics2D g2 = (Graphics2D) g;
        
        g2.draw(ruta);
    }
    
    public static void main(String[] args) {
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Dibujando Curva Cuadrática");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.WHITE);
        ventana.setSize(320, 240);
        
        DibujoCurvaCuadratica panel = new DibujoCurvaCuadratica();
        ventana.add(panel);
                
        ventana.setVisible(true);
    }
}
