package ejercicio0000181;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Ejercicio 181: Usar la clase Graphics para dibujar un arco en un objeto 
 * JPanel.
 * 
 * @author John Ortiz Ordoñez
 */
public class DibujoArco extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawArc(10, 10, 200, 200, 0, 180);
    }
    
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Dibujando un Arco");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.white);
        ventana.setSize(300, 200);
        
        DibujoArco panel = new DibujoArco();
        ventana.add(panel);
        
        ventana.setVisible(true);
    }
}
