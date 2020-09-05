package ejercicio0000356;

/**
 * 
 *
 * @author John Ortiz Ordoñez
 */
public class RadioAnalogo implements Radio {
    
    private boolean encendido;
    
    @Override
    public void encender() {
        encendido = true;
    }

    @Override
    public void apagar() {
        encendido = false;
    }

    public boolean estaEncendido() {
        return encendido;
    }
}
