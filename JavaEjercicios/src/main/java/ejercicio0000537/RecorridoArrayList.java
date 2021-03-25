package ejercicio0000537;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 537: Usar una expresión lambda para recorrer el contenido de un ArrayList.
 *
 * @author John Ortiz Ordoñez
 */
public class RecorridoArrayList {

    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        
        // Iteración por índices:
        System.out.println("Iteración por iteración:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        
        System.out.println();
        
        System.out.println("Iteración con expresión lambda:");
        numeros.stream().forEach(System.out::println);
        
        System.out.println();
        
        System.out.println("Iteración con expresión lambda:");
        numeros.stream().forEach(n -> System.out.println(n));
    }
}
