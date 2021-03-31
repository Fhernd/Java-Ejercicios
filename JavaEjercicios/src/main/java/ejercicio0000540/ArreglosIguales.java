package ejercicio0000540;

import java.util.Arrays;

/**
 * Ejercicio 540: Validar si dos arreglos son iguales con la función equals() de la clase Arrays.
 *
 * @author John Ortiz Ordoñez
 */
public class ArreglosIguales {

    public static void main(String[] args) {
        
        int[] numeros1 = {1, 2, 3};
        int[] numeros2 = {3, 2, 1};
        
        System.out.println(Arrays.equals(numeros1, numeros2));  // false
        
        System.out.println();
        
        Arrays.sort(numeros2);
        
        System.out.println(Arrays.equals(numeros1, numeros2));  // true
    }
}
