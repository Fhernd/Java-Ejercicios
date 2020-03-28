package ejercicio0000109;

import java.util.TreeSet;

/**
 * Ejercicio 109: Mantener siempre el orden de los elementos.
 * 
 * @author John Ortiz Ordoñez
 */
public class ManteniendoOrden {

    public static void main(String[] args) {
        
        TreeSet<String> escritores = new TreeSet<>();
        
        escritores.add("Dostoiévskiy");
        escritores.add("Balzac");
        
        for (String escritor : escritores) {
            System.out.println(escritor);
        }
        
        escritores.add("Vallejo");
        escritores.add("Dickens");
        
        System.out.println("");
        
        for (String escritor : escritores) {
            System.out.println(escritor);
        }
    }
}
