package ejercicio0000449;

/**
 * 
 * @author John Ortiz Ordoñez.
 */
public interface Vehiculo {
    void acelarar();
    void frenar();
    void estacionarse();
    default void reparar() {
        System.out.println("El vehículo se reparará.");
    }
}
