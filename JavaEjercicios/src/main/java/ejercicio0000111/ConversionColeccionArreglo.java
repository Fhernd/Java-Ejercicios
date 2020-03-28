package ejercicio0000111;

import java.util.ArrayList;

/**
 * Ejercicio 111: Convertir una colección en un arreglo.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConversionColeccionArreglo {
    
    public static void main(String[] args) {
        
        ArrayList<String> escritores = new ArrayList<>();
        escritores.add("Dostoievskiy");
        escritores.add("Balzac");
        escritores.add("Dickens");
        
        Object[] escritoresObject = escritores.toArray();
        
        for (Object escritor : escritoresObject) {
            System.out.println(escritor);
        }
        
        String[] escritoresString = (String[]) escritores.toArray(new String[0]);
        System.out.println("");
        
        for (String escritor : escritoresString) {
            System.out.println(escritor);
        }
    }
}
