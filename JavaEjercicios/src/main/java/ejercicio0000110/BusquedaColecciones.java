package ejercicio0000110;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Ejercicio 110: Encontrar elementos en una colección.
 *
 * @author John Ortiz Ordoñez
 */
public class BusquedaColecciones {

    public static void main(String[] args) {

        // Búsqueda en un arreglo de enteros:
        System.out.println("Búsqueda en arreglos:");
        int[] numeros = {7, 9, 13, 2, 5, 0, 18};
        
        Arrays.sort(numeros);
        
        System.out.println("El valor 5 se encuentra en la posición: " + Arrays.binarySearch(numeros, 5));
        
        // Búsqueda sobre un ArrayList:
        ArrayList<String> escritores = new ArrayList<>();
        escritores.add("Dostoievskiy");
        escritores.add("Balzac");
        escritores.add("Dickens");
        
        System.out.println("\n¿Vallejo se encuentra en el ArrayList?: " + escritores.contains("Vallejo"));
        System.out.println("\n¿Vallejo se encuentra en el ArrayList?: " + escritores.contains("Balzac"));
        
        System.out.println("\nDickens se encuentra la posición " + escritores.indexOf("Dickens") + " del ArrayList.");
        
        
        // Búsqueda en Hashmap:
        HashMap<Integer, String> estudiantes = new HashMap<>();
        estudiantes.put(1001, "Edward Ortiz");
        estudiantes.put(1002, "Germán Meneses");
        estudiantes.put(1003, "Daniela Ordoñez");
        
        System.out.println("\nBúsqueda en un HashMap:\n");
        
        System.out.println("¿Existe el código 1001?: " + estudiantes.containsKey(10001));
        System.out.println("¿Existe el código 1001?: " + estudiantes.containsKey(1001));
    }
}
