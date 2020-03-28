package ejercicio0000263;

import java.util.function.DoubleFunction;

/**
 * Ejercicio 263: Duplicar un número usando programación funcional.
 * 
 * @author John Ortiz Ordoñez
 */
public class DuplicacionNumero {

    public static void main(String[] args) {
        
        DoubleFunction<Double> duplicar = numero -> numero * 2;
        
        System.out.println(duplicar.apply(3.5));
        System.out.println(duplicar.apply(-3.5));
    }
}
