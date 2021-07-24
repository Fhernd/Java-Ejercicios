package ejercicio0000578;

import java.util.Arrays;

/**
 * Ejercicio 578: Definir una función para calcular el subarreglo continuo con la menor suma.
 * 
 * @author John Ortiz Ordoñez.
 */
public class MenorSumaSubarreglo {

    public static void main(String[] args) {
        
        // {2, 7, 11, 5, 3, 23, 19, 2, 5, 7, 13}
        // n = 3
        // {2, 7, 11} = 20
        // {7, 11, 5} = 23
        // {11, 5, 3} = 19
        // {5, 3, 23} = 31
        // {3, 23, 19} = 45
        // {23, 19, 2} = 44
        // {19, 2, 5} = 26
        // {2, 5, 7} = 14
        // {5, 7, 13} = 25
        
        int[] numeros = {2, 7, 11, 5, 3, 23, 19, 2, 5, 7, 13};
        int n = 3;
        
        System.out.println(Arrays.toString(numeros));
        
        System.out.println();
        
        int[] resultado = obtenerSubarregloSumaMenor(numeros, n);
        
        System.out.println(Arrays.toString(resultado)); // [52, 5, 7]
    }
    
    public static int[] obtenerSubarregloSumaMenor(int[] numeros, int n) {
        int suma;
        int sumaMenor = Integer.MAX_VALUE;
        int indice = 0;
        
        for(int i = 0; i < numeros.length - n; ++i) {
            suma = 0;
            
            for(int j = i, k = 0; k < n; ++j, ++k) {
                suma += numeros[j];
            }
            
            if (suma < sumaMenor) {
                sumaMenor = suma;
                indice = i;
            }
        }
        
        int[] resultado = new int[n];
        
        for(int i = indice, j = 0; j < n; i++, j++) {
            resultado[j] = numeros[i];
        }
        
        return resultado;
    }
}
