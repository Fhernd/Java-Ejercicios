package ejercicio0000627;

import java.util.Arrays;

/**
 * Ejercicio 627: Multiplicar dos arreglos elemento a elemento en una función.
 *
 * @author: John Ortiz Ordoñez
 */
public class MultiplicacionArreglosPorElementos {
    public static void main(String[] args) {
        int[] numerosPrimos = {2, 3, 5, 7};
        int[] numerosPares = {10, 20, 30};

        int[] resultado = multiplicarArreglos(numerosPrimos, numerosPares);
        System.out.println(Arrays.toString(resultado)); // [20, 60, 150]
    }

    public static int[] multiplicarArreglos(int[] primerArreglo, int[] segundoArreglo) {
        int menorLongitud = Math.min(primerArreglo.length, segundoArreglo.length);
        int[] resultado = new int[menorLongitud];

        for (int i = 0; i < menorLongitud; i++) {
            resultado[i] = primerArreglo[i] * segundoArreglo[i];
        }

        return resultado;
    }
}
