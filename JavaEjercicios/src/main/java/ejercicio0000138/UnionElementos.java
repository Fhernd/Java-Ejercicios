package ejercicio0000138;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Ejercicio 138: Unión de elementos.
 * 
 * @author John Ortiz Ordoñez
 */
public class UnionElementos {

    public static void main(String[] args) {
        
        String frase = Stream.of("Java", "es", "génial")
                .collect(Collectors.joining(" "));
        
        System.out.println("Frase: " + frase);
    }
}
