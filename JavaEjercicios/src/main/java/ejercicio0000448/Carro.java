package ejercicio0000448;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class Carro implements Vehiculo {

    @Override
    public void acelarar() {
        System.out.println("El carro ha acelerado.");
    }

    @Override
    public void frenar() {
        System.out.println("El carro ha frenado.");
    }

    @Override
    public void estacionarse() {
        System.out.println("El carro se ha estacionado.");
    }
}
