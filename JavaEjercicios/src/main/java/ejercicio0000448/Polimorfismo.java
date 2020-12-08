package ejercicio0000448;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 448: Aplicar polimorfismo a una jerarquía de herencia que 
 * contiene interfaces.
 *
 * @author John Ortiz Ordoñez
 */
public class Polimorfismo {

    public static void main(String[] args) {
        
        Vehiculo bicicleta = new Bicicleta();
        Vehiculo carro = new Carro();
        
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(bicicleta);
        vehiculos.add(carro);
        
        for (Vehiculo e : vehiculos) {
            e.acelarar();
            e.frenar();
        }
    }
}
