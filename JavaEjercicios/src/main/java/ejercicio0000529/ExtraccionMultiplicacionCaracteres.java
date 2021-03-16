package ejercicio0000529;

import java.util.Collections;

/**
 * Ejercicio 529: Extraer los primeros n caracteres de una cadena y multiplicarlos según un valor específico.
 *
 * @author John Ortiz Ordoñez
 */
public class ExtraccionMultiplicacionCaracteres {

    public static void main(String[] args) {

        System.out.println(extraerMultiplicarTexto("Java es tremendo", 4, 5));
        System.out.println(extraerMultiplicarTexto("Java es tremendo", 20, 5));
    }

    public static String extraerMultiplicarTexto(String texto, int n, int k) {
        if (n <= texto.length()) {
            String subcadena = texto.substring(0, n);

            return String.join("", Collections.nCopies(k, subcadena));
        } else {
            return texto;
        }
    }
}
