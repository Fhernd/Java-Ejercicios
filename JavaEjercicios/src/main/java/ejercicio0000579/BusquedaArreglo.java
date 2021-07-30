package ejercicio0000579;

import java.util.Arrays;

/**
 * Ejercicio 579: Búsqueda de un dato en un arreglo con función personalizada.
 *
 * @author John Ortiz Ordoñez.
 */
public class BusquedaArreglo {

    public static void main(String[] args) {
        
        int[] primos = {29, 13, 2, 5, 31, 17, 7, 11};
        System.out.println(Arrays.toString(primos));
        
        System.out.println();
        
        Arrays.sort(primos);
        System.out.println(Arrays.toString(primos));
        
        System.out.println();
        
        System.out.println(busquedaBinaria(primos, 31));    // 7
    }
    
    public static int busquedaBinaria(int[] numeros, int numero) {
        int inicio = 0;
        int fin = numeros.length - 1;
        int mitad;
        
        while (inicio <= fin) {
            mitad = inicio + (fin - inicio) / 2;
            System.out.println(numeros[mitad]);
            
            if (numeros[mitad] == numero) {
                return mitad;
            } else if (numeros[mitad] < numero) {
                inicio = mitad + 1;
            } else {
                fin = mitad - 1;
            }
        }
        
        return -1;
    }
}

