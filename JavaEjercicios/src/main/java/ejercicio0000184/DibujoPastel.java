package ejercicio0000184;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Ejercicio 184: Usar la clase Graphics para dibujar un pastel sobre un 
 * objeto JPanel.
 * 
 * @author John Ortiz Ordoñez
 */
public class DibujoPastel extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        Arc2D.Float arco = new Arc2D.Float(Arc2D.PIE);
        arco.setFrame(50, 10, 200, 200);
        
        arco.setAngleStart(0);
        arco.setAngleExtent(100);
        g2.setColor(Color.BLACK);
        g2.draw(arco);
        g2.setColor(Color.RED);
        g2.fill(arco);
        
        arco.setAngleStart(100);
        arco.setAngleExtent(150);
        g2.setColor(Color.BLACK);
        g2.draw(arco);
        g2.setColor(Color.GREEN);
        g2.fill(arco);
        
        arco.setAngleStart(250);
        arco.setAngleExtent(110);
        g2.setColor(Color.BLACK);
        g2.draw(arco);
        g2.setColor(Color.BLUE);
        g2.fill(arco);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Dibujando un Pastel");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.WHITE);
        ventana.setSize(300, 300);
        
        DibujoPastel panel = new DibujoPastel();
        ventana.add(panel);
        
        ventana.setVisible(true);
    }
}
