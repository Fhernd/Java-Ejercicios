package ejercicio0000638;

import java.util.Arrays;

/**
 * Ejercicio 638: Ordenar los números impares a la izquierda y los pares a la derecha de un arreglo.
 *
 * @author: John Ortiz Ordoñez
 */
public class OrdenImparesPares {
    public static void main(String[] args) {
        int[] numeros = {7, 5, 3, 2, 11, 14, 13, 8, 6, 1};

        System.out.println(Arrays.toString(numeros));

        System.out.println();

        ordenarImparesPares(numeros);

        System.out.println(Arrays.toString(numeros));
    }

    public static void ordenarImparesPares(int[] numeros) {
        int n = numeros.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] % 2 == 0) {
                    int temporal = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temporal;
                }
            }
        }
    }
}
