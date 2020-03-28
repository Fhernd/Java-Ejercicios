package ejercicio0000262;

import java.util.function.BiFunction;

/**
 * Ejercicio 262: Crear funciones para las operaciones ariméticas básicas usando programación funcional.
 * 
 * @author John Ortiz Ordoñez
 */
public class Aritmetica {

    public static void main(String[] args) {
        
        BiFunction<Double, Double, Double> sumar = (a, b) -> a + b;
        BiFunction<Double, Double, Double> restar = (a, b) -> a - b;
        BiFunction<Double, Double, Double> multiplicar = (a, b) -> a * b;
        BiFunction<Double, Double, Double> dividir = (a, b) -> a / b;
        
        final Double numero1 = 2.0;
        final Double numero2 = 3.0;
        
        System.out.println(sumar.apply(numero1, numero2));
        System.out.println(restar.apply(numero1, numero2));
        System.out.println(multiplicar.apply(numero1, numero2));
        System.out.println(dividir.apply(numero1, numero2));
    }
}
