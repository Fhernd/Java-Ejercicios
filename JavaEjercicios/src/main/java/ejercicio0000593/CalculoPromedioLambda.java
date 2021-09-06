package ejercicio0000593;

import java.util.Arrays;

/**
 * Ejercicio 593: Calcular el promedio de un grupo de números almacenados en un arreglo usando una expresión lambda.
 *
 * @author John Ortiz Ordoñez.
 */
public class CalculoPromedioLambda {

    public static void main(String[] args) {
        int[] numeros = {7, 13, 2, 5, 29, 23, 17, 3, 31, 11};
        
        int suma = Arrays.stream(numeros).sum();
        
        double promedio = suma / (double) numeros.length;
        
        System.out.printf("La suma es igual a: %d\n", suma);
        
        System.out.println();
        
        
        System.out.printf("El promedio es igual a: %.3f\n", promedio);
    }
}
