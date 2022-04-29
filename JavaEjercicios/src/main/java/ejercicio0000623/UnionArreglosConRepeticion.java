package ejercicio0000623;

import java.util.Arrays;

/**
 * Ejercicio 623: Unir el contenido de dos arreglos en uno nuevo (permitir repeticiones).
 *
 * @author: John Ortiz Ordoñez
 */
public class UnionArreglosConRepeticion {
    public static void main(String[] args) {
        int[] primos = {2, 3, 5, 7, 11};
        int[] numeros = {29, 5, 2, 19};

        int[] resultado = unirArreglosConRepeticiones(primos, numeros);

        System.out.println(Arrays.toString(resultado)); // [2, 3, 5, 7, 11, 29, 5, 2, 19]
    }

    public static int[] unirArreglosConRepeticiones(int[] primerArreglo, int[] segundoArreglo) {
        int[] resultado = new int[primerArreglo.length + segundoArreglo.length];
        int j = 0;

        for (int i = 0; i < primerArreglo.length; i++, ++j) {
            resultado[j] = primerArreglo[i];
        }

        for (int i = 0; i < segundoArreglo.length; i++, ++j) {
            resultado[j] = segundoArreglo[i];
        }

        return resultado;
    }
}
