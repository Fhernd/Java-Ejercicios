package ejercicio0000114;

import java.util.Random;

/**
 * Ejercicio 114: Uso de arreglos multidimensionales.
 * 
 * @author John Ortiz Ordoñez
 */
public class ArreglosMultidimensionales {

    public static void main(String[] args) {
        
        int[][] matriz = new int[3][3];
        
        Random aleatorio = new Random();
        
        // Llenar la matriz:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = aleatorio.nextInt(100);
            }
        }
        
        // Mostremos el contenido de la matriz:
        for (int[] fila : matriz) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println("");
        }
    }
}
