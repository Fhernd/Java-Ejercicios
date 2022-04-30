package ejercicio0000640;

/**
 * Ejercicio 640: Comprobar si un valor x existe en un arreglo y un valor y después en un arreglo.
 *
 * @author: John Ortiz Ordoñez
 */
public class ValidacionExistenciaNumeros {
    public static void main(String[] args) {
        int[] numeros = {2, 3, 5, 7, 11, 13, 17};

        System.out.println(existenValores(numeros, 2, 17)); // true
        System.out.println(existenValores(numeros, 2, 19)); // false
        System.out.println(existenValores(numeros, 5, 11)); // true
    }

    public static boolean existenValores(int[] numeros, int x, int y) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == x) {
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[j] == y) {
                        return true;
                    }
                }
                break;
            }
        }

        return false;
    }
}
