package ejercicio0000315;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

/**
 * Ejercicio 315: Animar una imagen a través del uso de threads.
 *
 * @author John Ortiz Ordoñez
 */
public class Animacion extends Applet implements ActionListener {

    private static final long serialVersionUID = 8614474910357445214L;

    protected Panel panel;
    protected Image imagen;
    List<ImagenAnimable> imagenes;

    @Override
    public void init() {
        Button btnCrearImagen = new Button("Iniciar animación");
        btnCrearImagen.addActionListener(this);
        setLayout(new BorderLayout());
        add(btnCrearImagen, BorderLayout.NORTH);
        panel = new Panel();
        add(panel, BorderLayout.CENTER);

        imagen = getImage(getCodeBase(), "duke.png");

        MediaTracker mediaTracker = new MediaTracker(this);
        mediaTracker.addImage(imagen, 0);

        try {
            mediaTracker.waitForID(0);
        } catch (Exception e) {
            throw new IllegalArgumentException("No se ha podido cargar la imagen.");
        }

        if (mediaTracker.isErrorID(0)) {
            throw new IllegalArgumentException("No se ha podido cargar la imagen a partir de su ID.");
        }

        imagenes = new Vector<>();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Se ha creado otra imagen para animar.");
        ImagenAnimable imagenAnimable = new ImagenAnimable(this, imagen);
        imagenAnimable.iniciar();
        panel.add(imagenAnimable);
        imagenes.add(imagenAnimable);
    }

    @Override
    public void stop() {
        for (int i = 0; i < imagenes.size(); i++) {
            imagenes.get(i).detener();
        }

        imagenes.clear();
    }
}
