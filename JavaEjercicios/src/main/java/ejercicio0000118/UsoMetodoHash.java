package ejercicio0000118;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 118: Uso del método hashCode.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoMetodoHash {

    public static void main(String[] args) {
        
        List<String> escritores = new ArrayList<>();
        escritores.add("Vallejo");
        escritores.add("Llosa");
        escritores.add("Lorca");
        escritores.add("Roberto Bolaño");
        escritores.add("Dostoievskiy");
        escritores.add("Balzac");
        escritores.add("Púshkin");
        escritores.add("Dickens");
        escritores.add("Gabriel García Márquez");
        escritores.add("Alexandre Dumas");
        
        for (String escritor : escritores) {
            System.out.println("Hashcode de " + escritor + ": " + escritor.hashCode());
        }
    }
}
