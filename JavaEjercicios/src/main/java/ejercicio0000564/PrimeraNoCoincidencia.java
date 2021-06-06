package ejercicio0000564;

import java.util.Arrays;

/**
 * Ejercicio 564: Usar el método mismatch() para encontrar el índice donde dos arreglos no son iguales.
 *
 * @author John Ortiz Ordoñez.
 */
public class PrimeraNoCoincidencia {

    public static void main(String[] args) {
        
        int[] numeros1 = {2, 3, 5, 7, 11, 13, 17};
        int[] numeros2 = {2, 3, 5, 7, 11, 13, 17};
        int[] numeros3 = {2, 3, 5, 7, 10, 13, 17};
        
        System.out.println("numeros1: " + Arrays.toString(numeros1));
        System.out.println("numeros2: " + Arrays.toString(numeros2));
        System.out.println("numeros3: " + Arrays.toString(numeros3));
        
        System.out.println();
        
        System.out.println(Arrays.mismatch(numeros1, numeros1));    // -1
        System.out.println(Arrays.mismatch(numeros1, numeros3));    // 4
    }
}
