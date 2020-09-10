package ejercicio0000365;

import java.util.stream.Stream;

/**
 * Ejercicio 365: Eliminar elementos de una estructura mientras se cumpla 
 * una condición.
 *
 * @author John Ortiz Ordoñez
 */
public class EliminarMientrasQue {

    public static void main(String[] args) {
        
        Stream.of("C++", "PHP", "Go", "Python", "JavaScript", "C", "Java")
                .dropWhile(l -> !l.contains("Java"))
                .forEach(System.out::println);
    }
}
