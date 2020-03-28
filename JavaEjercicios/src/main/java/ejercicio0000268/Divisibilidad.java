package ejercicio0000268;

import java.util.function.BiPredicate;

/**
 * Ejercicio 268: Comprobar si un número es divisible por otro usando 
 * programación funcional.
 * 
 * @author John Ortiz Ordoñez
 */
public class Divisibilidad {

    public static void main(String[] args) {
        
        BiPredicate<Integer, Integer> esDivisible = (x, y) -> x % y == 0;
        
        Integer numero1 = 2;
        Integer numero2 = 3;
        
        System.out.println(esDivisible.test(numero1, numero2));
        
        numero1 = 12;
        numero2 = 4;
        
        System.out.println(esDivisible.test(numero1, numero2));
    }
}
