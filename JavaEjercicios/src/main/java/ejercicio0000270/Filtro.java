package ejercicio0000270;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Ejercicio 270: Crear un filtro sobre un conjunto de números enteros.
 * 
 * @author John Ortiz Ordoñez
 */
public class Filtro {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(2, 3, 4, 5, 7, 13, 10, 6, 8);
        
        Predicate<Integer> esNumeroPar = x -> x % 2 == 0;
        
        numeros.stream().filter(esNumeroPar)
                .forEach(System.out::println);
    }
}
