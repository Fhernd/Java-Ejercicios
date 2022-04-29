package ejercicio0000624;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ejercicio 624: Unir el contenido de dos arreglos en uno nuevo (no permitir repeticiones).
 *
 * @author: John Ortiz Ordoñez
 */
public class UnionArregloSinRepeticion {
    public static void main(String[] args) {
        int[] primos = {2, 3, 5, 7, 11};
        int[] numeros = {29, 5, 2, 19};

        int[] resultado = unirArreglosSinRepeticion(primos, numeros);

        System.out.println(Arrays.toString(resultado)); // [2, 3, 5, 7, 11, 29, 19]
    }

    public static int[] unirArreglosSinRepeticion(int[] primerArreglo, int[] segundoArreglo) {
        List<Integer> resultado = new ArrayList<>();

        for (int n :
                primerArreglo) {
            if (!resultado.contains(n)) {
                resultado.add(n);
            }
        }

        for (int n :
                segundoArreglo) {
            if (!resultado.contains(n)) {
                resultado.add(n);
            }
        }

        int[] numeros = new int[resultado.size()];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = resultado.get(i);
        }

        return numeros;
    }
}
