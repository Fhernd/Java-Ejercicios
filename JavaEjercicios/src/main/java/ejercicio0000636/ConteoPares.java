package ejercicio0000636;

/**
 * Ejercicio 636: Contar los valores pares que se encuentran en un arreglo.
 *
 * @author: John Ortiz Ordoñez
 */
public class ConteoPares {
    public static void main(String[] args) {
        int[] numeros = {13, 12, 8, 5, 3, 10, 50, 100};

        System.out.println(contarPares(numeros));   // 5
    }

    public static int contarPares(int[] numeros) {
        int conteo = 0;

        for (int n :
                numeros) {
            if (n % 2 == 0) {
                ++conteo;
            }
        }

        return conteo;
    }
}
