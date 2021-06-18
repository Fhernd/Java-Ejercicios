package ejercicio0000568;

import java.util.Arrays;

/**
 * Ejercicio 568: Fusionar dos arreglos y luego ordenarlos en modo descendente.
 *
 * @author John Ortiz Ordoñez.
 */
public class FusionOrdenArreglos {

    public static void main(String[] args) {

        int[] primos = {7, 13, 2, 19, 5};
        int[] pares = {6, 4, 12, 8, 10};

        System.out.println(Arrays.toString(primos));
        System.out.println(Arrays.toString(pares));

        System.out.println();

        int[] resultado = fusionarOrdenarArreglos(primos, pares);

        for (int i = resultado.length - 1; i >= 0; --i) {
            System.out.print(resultado[i] + " ");
        }
    }

    public static int[] fusionarOrdenarArreglos(int[] arreglo1, int[] arreglo2) {
        int longitud = arreglo1.length + arreglo2.length;
        int[] resultado = new int[longitud];

        int indice = 0;

        for (int numero : arreglo1) {
            resultado[indice] = numero;

            ++indice;
        }

        for (int numero : arreglo2) {
            resultado[indice] = numero;

            ++indice;
        }

        Arrays.sort(resultado);

        return resultado;
    }
}
