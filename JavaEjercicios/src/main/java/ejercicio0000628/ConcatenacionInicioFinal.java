package ejercicio0000628;

/**
 * Ejercicio 628: Concatenar a un texto al inicio y al final sus tres últimos caracteres.
 *
 * @author: John Ortiz Ordoñez
 */
public class ConcatenacionInicioFinal {
    public static void main(String[] args) {
        System.out.println(concatenarAlInicioFinal("Java"));    // avaJavaava
        System.out.println(concatenarAlInicioFinal("Perro"));    // rroPerrorro
    }

    public static String concatenarAlInicioFinal(String texto) {
        String ultimos3Caracters = texto.substring(texto.length() - 3);

        return String.format("%s%s%s", ultimos3Caracters, texto, ultimos3Caracters);
    }
}
