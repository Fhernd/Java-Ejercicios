package ejercicio0000447;

/**
 * Ejercicio 447: Implementar una jerarquía de herencia utilizando interfaces.
 *
 * @author John Ortiz Ordoñez
 */
public class Bicicleta implements Vehiculo {

    @Override
    public void acelarar() {
        System.out.println("La bicleta se ha acelarado.");
    }

    @Override
    public void frenar() {
        System.out.println("La bicleta ha frenado.");
    }

    @Override
    public void estacionarse() {
        System.out.println("La bicicleta se ha estacionado");
    }

}
