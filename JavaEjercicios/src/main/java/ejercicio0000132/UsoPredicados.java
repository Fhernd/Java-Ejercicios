package ejercicio0000132;

import java.util.function.Predicate;

/**
 * Ejercicio 132: Uso de predicados.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoPredicados {

    public static void main(String[] args) {
        
        Predicate<String> cadenaIgual = s -> {
            return s.equals("Java");
        };
        
        System.out.println(cadenaIgual.test("Java"));
        System.out.println(cadenaIgual.test("JaVa"));
        
        
        Predicate<Integer> esMayorA0 = i -> {
            return i > 0;
        };
        
        System.out.println("");
        
        System.out.println(esMayorA0.test(0));
        System.out.println(esMayorA0.test(7));
    }
}
