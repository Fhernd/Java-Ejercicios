package ejercicio0000180;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Ejercicio 180: Usar la clase Graphics para dibujar texto en un objeto 
 * JPanel.
 * @author John Ortiz Ordoñez
 */
public class DibujoTexto extends JPanel{

    private String texto;

    public DibujoTexto(String texto) {
        this.texto = texto;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawString(texto, 50, 50);
    }
    
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        JFrame ventana = new JFrame("Dibujando Texto");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.white);
        ventana.setSize(200, 200);
        
        String nickname;
        
        do{
            nickname = JOptionPane.showInputDialog(ventana, "Escriba su nickname", "Mensaje", JOptionPane.QUESTION_MESSAGE);
            
            nickname = nickname.trim();
        } while(nickname.equals(""));
        
        DibujoTexto panel = new DibujoTexto(nickname);
        ventana.add(panel);
        
        ventana.setVisible(true);
    }
}
