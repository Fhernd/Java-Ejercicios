package ejercicio0000106;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Ejercicio 106: Usar las estructuras de datos Hashtable y HashMap.
 * 
 * @author John Ortiz Ordoñez
 */
public class MapeoDatos {
    public static void main(String[] args) {
        
        // HashMap:
        System.out.println("\nUso de HashMap:");
        HashMap<Integer, String> personas = new HashMap<>();
        personas.put(123456, "Edward Ortiz");
        personas.put(987654, "Sonia García");
        personas.put(741852, "Daniela Ortiz");
        
        for (Integer cedula : personas.keySet()) {
            System.out.printf("%s -> %s\n", cedula, personas.get(cedula));
        }
        
        // Hashtable:
        System.out.println("\n\nUso de Hashtable:");
        Hashtable<Integer, String> personas2 = new Hashtable<>();
        personas2.put(123456, "Edward Ortiz");
        personas2.put(987654, "Sonia García");
        personas2.put(741852, "Daniela Ortiz");
        
        for (Integer cedula : personas2.keySet()) {
            System.out.printf("%s -> %s\n", cedula, personas2.get(cedula));
        }
    }
}
