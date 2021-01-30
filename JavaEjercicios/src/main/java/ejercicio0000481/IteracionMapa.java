package ejercicio0000481;

import java.util.Map;
import java.util.HashMap;

/**
 * Ejercicio 481: Iterar un objeto Map con el método de instancia entrySet().
 *
 * @author John Ortiz Ordoñez
 */
public class IteracionMapa {

    public static void main(String[] args) {
        
        Map<Integer, String> lenguajes = new HashMap<>();
        
        lenguajes.put(1001, "Java");
        lenguajes.put(1002, "Python");
        lenguajes.put(1003, "C++");
        lenguajes.put(1004, "JavaScript");
        lenguajes.put(1005, "Kotlin");
        
        for(Map.Entry<Integer, String> lenguaje : lenguajes.entrySet()) {
            System.out.printf("%d: %s\n", lenguaje.getKey(), lenguaje.getValue());
        }
    }
}
