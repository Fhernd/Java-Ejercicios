package ejercicio0000612;

/**
 * Ejercicio 612: Crear n copias de los últimos tres (3) caracteres de un texto.
 *
 * @author: John Ortiz Ordoñez
 */
public class CopiasCaracteres {
    public static void main(String[] args) {
        String resultado = generarCopiaCaracteres("Java", 5);

        System.out.println(resultado);
    }

    public static String generarCopiaCaracteres(String texto, int n) {
        if (texto.length() < 3) {
            return null;
        }

        String ultimos3Caracteres = texto.substring(texto.length() - 3);

        return ultimos3Caracteres.repeat(Math.max(0, n));
    }
}
