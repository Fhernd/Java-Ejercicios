package ejercicio0000561;

import java.util.Arrays;

/**
 * Ejercicio 561: Desplazar en una unidad hacia la izquierda los elementos de un arreglo.
 *
 * @author John Ortiz Ordoñez.
 */
public class DezplazamientoIzquierdaArreglo {

    public static void main(String[] args) {
        
        // [1, 2, 3, 4, 5]
        // [2, 3, 4, 5, 1]
        
        // Primera iteración:
        // [2, 3, 3, 4, 5]
        // Segunda iteración:
        // [2, 3, 4, 4, 5]
        // Tercera iteración:
        // [2, 3, 4, 5, 5]
        // Al final:
        // [2, 3, 4, 5, 1]
        
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numeros));   // [1, 2, 3, 4, 5]
        
        System.out.println();
        
        if (numeros.length > 1) {
            int primerNumero = numeros[0];
            
            for (int i = 1; i < numeros.length; i++) {
                numeros[i - 1] = numeros[i];
            }
            
            numeros[numeros.length - 1] = primerNumero;
            
            System.out.println(Arrays.toString(numeros)); // [2, 3, 4, 5, 1]
        }
    }
}
