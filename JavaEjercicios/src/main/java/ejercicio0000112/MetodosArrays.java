package ejercicio0000112;

import java.util.Arrays;

/**
 * Ejercicio 112: Operaciones interesantes de la clase Arrays.
 * 
 * @author John Ortiz Ordoñez
 */
public class MetodosArrays {

    public static void main(String[] args) {
        
        // copyOf:
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
        System.out.println("\nUso del método copyOf:");
        int[] numerosCopia = Arrays.copyOf(numeros, 20);
        
        for (int numero : numerosCopia) {
            System.out.print(numero + " ");
        }
        System.out.println("\nUso del método equals:");
        int[] numerosCopia2 = numeros;
        
        System.out.println("\n¿numeros es igual a numerosCopia2?: " + Arrays.equals(numeros, numerosCopia2));
        
        // fill:
        System.out.println("\nUso del método fill:");
        int[] valores = new int[10];
        Arrays.fill(valores, 5);
        for (int valor : valores) {
            System.out.print(valor + " ");
        }
        
        // hashCode:
        System.out.println("\n\nUso del método hashCode:");
        
        System.out.println(Arrays.hashCode(valores));
        
        
        // toString:
        System.out.println("\n\nUso del método toStraing:");
        System.out.println(Arrays.toString(valores));
    }
}
