package ejercicio0000613;

/**
 * Ejercicio 613: Extraer la primera mitad de una cadena de caracteres con una función.
 *
 * @author: John Ortiz Ordoñez
 */
public class PrimeraMitadTexto {
    public static void main(String[] args) {
        System.out.println(extraerPrimeraMitad("Java"));    // Ja
        System.out.println(extraerPrimeraMitad("Python"));    // Pyt

        System.out.println(extraerPrimeraMitad("PHP"));
    }

    public static String extraerPrimeraMitad(String texto) {
        return texto.length() % 2 == 0 ? texto.substring(0, texto.length() / 2) : null;
    }
}
