package ejercicio0000228;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * Ejercicio 228: Usar etiquetas HTML en un componente Swing.
 *
 * @author John Ortiz Ordoñez
 */
public class HtmlComponentes extends JFrame {

    private static final long serialVersionUID = 7197798043725221038L;

    public HtmlComponentes() throws HeadlessException {
        super("Uso HTML en Componentes Swing");

        setLayout(new BorderLayout());

        String html = "<html><body><h1>Java</h1><p>Java es un lenguaje tremendo!</p></body></html>";

        JButton btnHtml = new JButton(html);
        add(btnHtml, BorderLayout.CENTER);

        btnHtml.addActionListener((e) -> {
            JOptionPane.showMessageDialog(this, "HTML en un componente Swing.");
        });
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(300, 500);
    }
    
    public static void main(String[] args) {
        
        final HtmlComponentes ventana = new HtmlComponentes();
        
        SwingUtilities.invokeLater(() -> {
            ventana.setVisible(true);
        });
    }
}
