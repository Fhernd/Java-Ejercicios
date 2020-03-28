package ejercicio0000315;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class ImagenAnimable extends Component implements Runnable {

    protected static int numeroImagen = 0;
    protected Thread thread;
    protected int x;
    protected int y;
    protected Component componentePadre;
    protected Image imagen;

    protected volatile boolean terminado = false;
    protected volatile int tiempoEspera = 250;

    protected int direccion;

    public static final int HORIZONTAL = 1;
    public static final int VERTICAL = 2;
    public static final int DIAGONAL = 3;

    public ImagenAnimable(Component componentePadre, Image imagen, int direccion) {
        this.componentePadre = componentePadre;
        this.imagen = imagen;

        switch (direccion) {
            case VERTICAL:
            case HORIZONTAL:
            case DIAGONAL:
                this.direccion = direccion;
                break;
            default:
                throw new IllegalArgumentException("La dirección de la imagen no es válida.");
        }

        setSize(imagen.getWidth(this), imagen.getHeight(this));
    }

    public ImagenAnimable(Component componentePadre, Image imagen) {
        this(componentePadre, imagen, DIAGONAL);
    }

    public void iniciar() {
        thread = new Thread(this);
        thread.setName("Imagen #" + numeroImagen);
        ++numeroImagen;
        thread.start();
    }

    public void detener() {
        if (thread == null) {
            return;
        }

        terminado = true;
    }

    protected void setTiempoEspera(int tiempo) {
        tiempoEspera = tiempo;
    }

    @Override
    public void run() {
        int ancho = componentePadre.getSize().width;
        int alto = componentePadre.getSize().height;

        x = (int) (Math.random() * ancho);
        y = (int) (Math.random() * alto);

        int incrementoX = Math.random() > 0.5 ? 1 : -1;
        int incrementoY = Math.random() > 0.5 ? 1 : -1;

        while (!terminado) {
            ancho = componentePadre.getSize().width;
            alto = componentePadre.getSize().height;
            
            if((x += incrementoX) >= ancho){
                x = 0;
            }
            if((y += incrementoY) >= alto){
                y = 0;
            }
            if (x < 0){
                x = ancho;
            }
            if (y < 0){
                y = alto;
            }
            
            switch(direccion){
                case VERTICAL:
                    x = 0;
                    break;
                case HORIZONTAL:
                    y = 0;
                    break;
                case DIAGONAL:
                    break;
            }
            
            setLocation(x, y);
            repaint();
            
            try {
                Thread.sleep(tiempoEspera);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(imagen, 0, 0, this);
    }
}
