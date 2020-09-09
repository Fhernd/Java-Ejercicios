package ejercicio0000363;

import java.util.Arrays;
import java.util.List;

/**
 * Ejercicio 363: Usar el método static Arrays.asList() para crear un objeto List.
 *
 * @author John Ortiz Ordoñez
 */
public class ConstruccionLista {

    public static void main(String[] args) {
        List<String> lenguajes = Arrays.asList("Java", "Python", "C++", "JavaScript", "C", "PHP");
        
        for (String lenguaje : lenguajes) {
            System.out.println(lenguaje);
        }
    }
}
