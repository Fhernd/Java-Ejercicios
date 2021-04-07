package ejercicio0000544;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Ejercicio 544: Usar un objeto IntStream para sumar los números almacenados en un arreglo.
 *
 * @author John Ortiz Ordoñez.
 */
public class SumaStream {

    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        IntStream stream = Arrays.stream(numeros);
        
        int suma = stream.sum();
        System.out.println(suma);   // 55
        
        System.out.println();
        
        System.out.println(Arrays.stream(numeros).sum());   // 55
        
        System.out.println();
        
        System.out.println(Arrays.stream(numeros).filter(n -> n % 2 == 1).sum());   // 25
        System.out.println(Arrays.stream(numeros).filter(n -> n % 2 == 0).sum());   // 30
        System.out.println(Arrays.stream(numeros).filter(n -> n % 3 == 0).sum());   // 18
    }
}
