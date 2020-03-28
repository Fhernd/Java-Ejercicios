package ejercicio0000220;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Ejercicio 220: Usar un objeto ActionEvent para detectar la fuente del 
 * evento click.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoActionEvent extends JFrame implements ActionListener{

    private static final long serialVersionUID = -6871398599597774845L;
    
    private JButton btnSaludar;
    private JButton btnDespedir;

    public UsoActionEvent() throws HeadlessException {
        super("Uso Objeto ActionEvent");
        
        setLayout(new FlowLayout());
        
        btnSaludar = new JButton("Saludar");
        add(btnSaludar);
        btnSaludar.addActionListener(this);
        
        btnDespedir = new JButton("Hasta pronto");
        add(btnDespedir);
        btnDespedir.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(350, 200);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSaludar){
            JOptionPane.showMessageDialog(this, "¡Hola!", "Mensaje", 
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "¡Hasta pronto!", "Mensaje", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        
        final UsoActionEvent ventana = new UsoActionEvent();
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ventana.setVisible(true);
            }
        });
    }
}
