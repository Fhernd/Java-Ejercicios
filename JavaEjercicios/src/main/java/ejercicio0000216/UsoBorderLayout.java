package ejercicio0000216;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Ejercicio 216: Hacer uso del layout BorderLayout para distribuir botones en 
 * 5 regiones geográficas.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoBorderLayout extends JFrame{
    
    private static final long serialVersionUID = -761161207710369446L;

    public UsoBorderLayout() throws HeadlessException {
        super("Uso BorderLayout");
        
        inicializarComponentes();   
    }

    private void inicializarComponentes() {
        LayoutManager layout = new BorderLayout();
        setLayout(layout);
        
        add(new JButton("Norte"), BorderLayout.NORTH);
        add(new JButton("Oriente"), BorderLayout.EAST);
        add(new JButton("Sur"), BorderLayout.SOUTH);
        add(new JButton("Occidente"), BorderLayout.WEST);
        add(new JButton("Centro"), BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(400, 200);
    }
    
    public static void main(String[] args) {
        
        final UsoBorderLayout ventana = new UsoBorderLayout();
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ventana.setVisible(true);
            }
        });
    }
}
