package ejercicio0000462;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Ejercicio 462: Usar la interfaz Consumer para recorrer un conjunto de datos de una lista.
 * 
 * @author John Ortiz Ordoñez.
 */
public class UsoClaseConsumer {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(11);
        numeros.add(13);
        
        Consumer<Integer> recorridoEnteros = (n) -> { System.err.println(n); };
        numeros.forEach(recorridoEnteros);
        
        System.out.println();
        System.out.println();
        
        recorridoEnteros = (n) -> { System.err.println(n * n); };
        numeros.forEach(recorridoEnteros);
    }
}
