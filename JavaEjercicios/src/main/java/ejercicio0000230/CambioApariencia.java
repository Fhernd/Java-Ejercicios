package ejercicio0000230;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Ejercicio 230: Cambiar la apariencia de ventanas y demás componentes 
 * visuales.
 * 
 * @author John Ortiz Ordoñez
 */
public class CambioApariencia extends JFrame{

    private static final long serialVersionUID = -6269136658397326513L;
    
    private static final String METAL = "javax.swing.plaf.metal.MetalLookAndFeel";
    private static final String WINDOWS = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
    private static final String MOTIF = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
    private static final String MAC_OS = "com.sun.java.swing.plaf.mac.MacLookAndFeel";
    private String aparienciaActual = METAL;

    private JRadioButton jbrAparienciaActual;
    
    public CambioApariencia() throws HeadlessException {
        super("Selector Look&Feel");
        
        setLayout(new FlowLayout());
        
        inicializarComponentes();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(500, 200);
    }

    private void inicializarComponentes() {
        
        ButtonGroup bgrApariencias = new ButtonGroup();
        
        JRadioButton jbrMetal = new JRadioButton("Metal");
        jbrMetal.addActionListener(new SeleccionApariencia(METAL, jbrMetal));
        bgrApariencias.add(jbrMetal);
        add(jbrMetal);
        
        JRadioButton jbrWindows = new JRadioButton("Windows");
        jbrWindows.addActionListener(new SeleccionApariencia(WINDOWS, jbrWindows));
        bgrApariencias.add(jbrWindows);
        add(jbrWindows);
        
        JRadioButton jbrMotif = new JRadioButton("Motif");
        jbrMotif.addActionListener(new SeleccionApariencia(MOTIF, jbrMotif));
        bgrApariencias.add(jbrMotif);
        add(jbrMotif);
        
        JRadioButton jbrMacOS = new JRadioButton("MacOS");
        jbrMacOS.addActionListener(new SeleccionApariencia(MAC_OS, jbrMacOS));
        bgrApariencias.add(jbrMacOS);
        add(jbrMacOS);
        
        aparienciaActual = UIManager.getSystemLookAndFeelClassName();
        JRadioButton jbrLookAndFeelActual = new JRadioButton("Actual");
        jbrLookAndFeelActual.addActionListener(new SeleccionApariencia(aparienciaActual, jbrLookAndFeelActual));
        bgrApariencias.add(jbrLookAndFeelActual);
        add(jbrLookAndFeelActual);
        
        (jbrAparienciaActual = jbrLookAndFeelActual).setSelected(true);
    }

    class SeleccionApariencia implements ActionListener{

        private String nombreApariencia;
        private JRadioButton jrbSeleccion;

        public SeleccionApariencia(String nombreApariencia, JRadioButton jrbSeleccion) {
            this.nombreApariencia = nombreApariencia;
            this.jrbSeleccion = jrbSeleccion;
        }
        
        @Override
        public void actionPerformed(ActionEvent evt) {
            try {
                
                UIManager.setLookAndFeel(nombreApariencia);
                SwingUtilities.updateComponentTreeUI(CambioApariencia.this);
                CambioApariencia.this.pack();
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
                JOptionPane.showMessageDialog(CambioApariencia.this, 
                        "No se pudo cambiar la apariencia. Error: " + 
                                e.getMessage(), "Error UI",
                        JOptionPane.ERROR_MESSAGE);
            }
            
            jbrAparienciaActual = jrbSeleccion;
        }   
    }
    
    public static void main(String[] args) {
        
        final CambioApariencia ventana = new CambioApariencia();
        
        SwingUtilities.invokeLater(() -> {
            ventana.setVisible(true);
        });
    }
}
