package ejercicio0000364;

import java.util.stream.Stream;

/**
 * Ejercicio 364: Usar el método takeWhile() para obtener elementos mientras 
 * se cumpla una condición.
 *
 * @author John Ortiz Ordoñez
 */
public class MientrasQue {

    public static void main(String[] args) {
        Stream.of("C++", "PHP", "Go", "Python", "JavaScript", "C", "Java")
                .takeWhile(l -> !l.contains("Java"))
                .forEach(System.out::println);
    }
}
