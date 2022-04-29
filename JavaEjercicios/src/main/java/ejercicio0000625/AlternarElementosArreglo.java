package ejercicio0000625;

import java.util.Arrays;

/**
 * Ejercicio 625: Alternar el primer y último elementos de un arreglo en una función.
 *
 * @author: John Ortiz Ordoñez
 */
public class AlternarElementosArreglo {
    public static void main(String[] args) {
        int[] numeros = {19, 3, 5, 7, 11, 13, 17, 2};

        System.out.println(Arrays.toString(numeros));

        System.out.println();

        alternarElementos(numeros);

        System.out.println(Arrays.toString(numeros));
    }

    public static void alternarElementos(int[] numeros) {
        int temporal = numeros[0];
        numeros[0] = numeros[numeros.length - 1];
        numeros[numeros.length - 1] = temporal;
    }
}
