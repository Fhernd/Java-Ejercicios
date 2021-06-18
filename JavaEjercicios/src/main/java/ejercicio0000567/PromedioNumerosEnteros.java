package ejercicio0000567;

import java.util.Arrays;

/**
 * Ejercicio 567: Calcular el promedio de un conjunto de números enteros almacenados en un arreglo.
 *
 * @author John Ortiz Ordoñez.
 */
public class PromedioNumerosEnteros {

    public static void main(String[] args) {
        
        int[] numeros = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        
        System.out.println("Contenido del arreglo numeros:");
        System.out.println(Arrays.toString(numeros));
        
        System.out.println();
        
        double resultado = calcularPromedio(numeros);
        System.out.println("El promedio es: " + resultado);
    }
    
    public static double calcularPromedio(int[] numeros) {
        int suma = 0;
        
        for (int numero : numeros) {
            suma += numero;
        }
        
        return suma / numeros.length;
    }
}
