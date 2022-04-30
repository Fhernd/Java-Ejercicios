package ejercicio0000639;

import java.util.Arrays;

/**
 * Ejercicio 639: Generar un arreglo de números pero como cadenas de caracteres (String).
 *
 * @author: John Ortiz Ordoñez
 */
public class ArregloNumerosTexto {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generarNumerosTexto(1, 10)));
        System.out.println(Arrays.toString(generarNumerosTexto(13, 21)));
    }

    public static String[] generarNumerosTexto(int inicio, int fin) {

        int limite = Math.abs(fin - inicio + 1);
        String[] numerosTexto = new String[limite];

        for (int i = 0; i < limite; i++, ++inicio) {
            numerosTexto[i] = String.valueOf(inicio);
        }

        return numerosTexto;
    }
}
