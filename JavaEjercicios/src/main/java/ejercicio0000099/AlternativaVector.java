package ejercicio0000099;

import java.util.Vector;

/**
 * Ejercicio 99: Uso de la clase Vector.
 * 
 * @author John Ortiz Ordoñez
 */
public class AlternativaVector {

    public static void main(String[] args) {
        
        Vector<Integer> enteros = new Vector<>(10);
        
        for (int i = 0; i < 1000000; i++) {
            enteros.add(i);
        }
        
        
    }
}
