package ejercicio0000221;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Ejercicio 221: Crear una clase anidada para responder a eventos de click.
 *
 * @author John Ortiz Ordoñez
 */
public class ClaseAnidadaEventoClick extends JFrame {

    private static final long serialVersionUID = -8210520324030356021L;

    private JButton btnSaludar;
    private JButton btnDespedir;
    private GestorEventos gestorEventos;

    public ClaseAnidadaEventoClick() throws HeadlessException {
        super("Uso Objeto ActionEvent");

        setLayout(new FlowLayout());
        
        gestorEventos = new GestorEventos();

        btnSaludar = new JButton("Saludar");
        add(btnSaludar);
        btnSaludar.addActionListener(gestorEventos);

        btnDespedir = new JButton("Hasta pronto");
        add(btnDespedir);
        btnDespedir.addActionListener(gestorEventos);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(350, 200);
    }

    class GestorEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnSaludar) {
                JOptionPane.showMessageDialog(null, "¡Hola!", "Mensaje",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "¡Hasta pronto!", "Mensaje",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    public static void main(String[] args) {

        final ClaseAnidadaEventoClick ventana = new ClaseAnidadaEventoClick();

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ventana.setVisible(true);
            }
        });
    }

}
