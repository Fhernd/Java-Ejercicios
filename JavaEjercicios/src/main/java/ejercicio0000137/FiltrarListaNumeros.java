package ejercicio0000137;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * Ejercicio 137: Filtrar un conjunto de números.
 * 
 * @author John Ortiz Ordoñez
 */
public class FiltrarListaNumeros {

    public static void main(String[] args) {
        
        Stream.of(1, 2, 3, null, 7, 11, null, 13, 19)
                .filter(Objects::nonNull)
                .map(numero -> Math.pow(numero, 3))
                .forEach(System.out::println);
    }
}
