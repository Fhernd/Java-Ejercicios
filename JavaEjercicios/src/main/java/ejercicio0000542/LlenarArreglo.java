package ejercicio0000542;

import java.util.Arrays;

/**
 * Ejercicio 542: Llenar un arreglo con un valor específico usando la función fill() de Arrays.
 *
 * @author John Ortiz Ordoñez.
 */
public class LlenarArreglo {

    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        
        System.out.println();
        System.out.println();
        
        Arrays.fill(numeros, 1000);
        
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
