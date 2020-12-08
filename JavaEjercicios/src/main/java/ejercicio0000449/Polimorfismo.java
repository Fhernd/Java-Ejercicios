package ejercicio0000449;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 449: Incorporar nueva funcionalidad en una interfaz sin alterar
 * una jerarquía de herencia.
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
            
            System.out.println();
            
            e.reparar();
        }
    }
}
