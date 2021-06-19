package ejercicio0000569;

import java.util.Arrays;

/**
 * Ejercicio 569: Rotar o desplazar una unidad a la derecha los elementos de un arreglo.
 *
 * @author John Ortiz Ordoñez.
 */
public class RotacionArreglo {

    public static void main(String[] args) {
        
        // {1, 2, 3, 4, 5}
        // {5, 1, 2, 3, 4}
        
        int[] numeros = {1, 2, 3, 4, 5};
        
        System.out.println(Arrays.toString(numeros));
        
        System.out.println();
        
        int[] resultado = rotarArregloUnaUnidad(numeros);
        System.out.println(Arrays.toString(resultado));
    }
    
    public static int[] rotarArregloUnaUnidad(int[] numeros) {
        int temporal;
        int[] resultado = new int[numeros.length];
        resultado[0] = numeros[numeros.length - 1];
        
        for(int i = 1; i < numeros.length; ++i) {
            resultado[i] = numeros[i - 1];
        }
        
        return resultado;
    }
}
