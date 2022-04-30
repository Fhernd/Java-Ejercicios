package ejercicio0000635;

/**
 * Ejercicio 635: Contar los valores impares que se encuentra en un arreglo de números enteros.
 *
 * @author: John Ortiz Ordoñez
 */
public class ConteoPares {
    public static void main(String[] args) {
        int[] numeros = {13, 12, 8, 5, 3, 10};

        System.out.println(contarImpares(numeros)); // 3
    }

    public static int contarImpares(int[] numeros) {
        int conteo = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 1) {
                ++conteo;
            }
        }

        return conteo;
    }
}
