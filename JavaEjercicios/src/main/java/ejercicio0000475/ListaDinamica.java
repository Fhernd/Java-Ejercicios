package ejercicio0000475;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 475: Usar la clase concreta ArrayList como estructura de datos 
 * dinámica.
 *
 * @author John Ortiz Ordoñez
 */
public class ListaDinamica {

    public static void main(String[] args) {
        
        List<Integer> primos = new ArrayList<>();
        
        System.out.println("Cantidad actual de elementos de la variable primos: " + primos.size());
        
        System.out.println();
        
        primos.add(2);
        primos.add(3);
        primos.add(5);
        primos.add(7);
        
        System.out.println("Cantidad actual de elementos de la variable primos: " + primos.size());
        
        System.out.println();
        
        primos.remove(1);
        
        System.out.println("Cantidad actual de elementos de la variable primos: " + primos.size());
        
        System.out.println();
        
        for (Integer primo : primos) {
            System.out.println(primo);
        }
    }
}
