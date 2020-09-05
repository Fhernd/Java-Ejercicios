package ejercicio0000356;

/**
 * 
 *
 * @author John Ortiz Ordoñez
 */
public class RadioDigital implements Radio{
    
    private boolean encendido;

    @Override
    public void encender() {
        encendido = true;
    }

    @Override
    public void apagar() {
        encendido = false;
    }

    public void conectarInternet() {
        System.out.println("Se ha realizado la conexión a Internet.");
    }
    
    public boolean estaEncendido() {
        return encendido;
    }
}
