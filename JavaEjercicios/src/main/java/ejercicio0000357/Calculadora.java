package ejercicio0000357;

import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;

/**
 * Ejercicio 357: Crear una interfaz con métodos privados y predeterminados.
 * 
 * @author John Ortiz Ordoñez
 */
public interface Calculadora {
    double sumar(double a, double b);
    
    double restar(double a, double b);
    
    default double sumarNumerosPares(double... numeros) {
        return sumarNumeros(n -> n % 2 == 0, numeros);
    }
    
    default double sumarNumerosImpares(double... numeros) {
        return sumarNumeros(n -> n % 2 == 1, numeros);
    }
    
    private double sumarNumeros(DoublePredicate predicado, double... numeros) {
        return DoubleStream.of(numeros).filter(predicado).sum();
    }
}
