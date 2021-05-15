package ejercicio0000558;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Ejercicio 558: Obtener los elementos de un arreglo a partir de la última coincidencia de un valor.
 *
 * @author John Ortiz Ordoñez.
 */
public class UltimaCoincidencia {

    public static void main(String[] args) {

        int[] numeros = {3, 7, 11, 2, 5, 11, 19, 3, 23, 17};

        System.out.println(Arrays.toString(numeros));

        System.out.println();

        int numero = 17;

        int indiceUltimaCoincidencia = Arrays.stream(numeros).boxed().collect(Collectors.toList()).lastIndexOf(numero);

        if (indiceUltimaCoincidencia != -1) {

            if (indiceUltimaCoincidencia < numeros.length - 1) {

                System.out.printf("Última coincidencia del valor %d: %d%n", numero, indiceUltimaCoincidencia);

                System.out.println();

                int[] resultado = Arrays.copyOfRange(numeros, indiceUltimaCoincidencia + 1, numeros.length);
                System.out.println(Arrays.toString(resultado)); // [19, 3, 23, 17]
            } else {
                System.out.println("No hay elementos adicionales a la derecha de la última coincidencia encontrada.");
            }
        } else {
            System.out.println("No se encontró ninguna coincidencia del valor buscado.");
        }
    }
}
