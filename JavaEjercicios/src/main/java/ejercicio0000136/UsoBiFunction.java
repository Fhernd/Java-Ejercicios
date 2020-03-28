package ejercicio0000136;

import java.util.function.BiFunction;

/**
 * Ejercicio 136: Uso de la interfaz BiFunction<T, U, R>.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoBiFunction {

    public static void main(String[] args) {
        
        BiFunction<Double, Double, Double> sumar = (a, b) -> {
            Double suma = a + b;
            
            return suma;
        };
        
        System.out.println("Suma: " + sumar.apply(new Double(2), new Double(3)));
    }
}
