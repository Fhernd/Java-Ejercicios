package ejercicio0000530;

/**
 * Ejercicio 530: Definir una función para extraer la mitad de una cadena de caracteres de longitud par.
 *
 * @author John Ortiz Ordoñez
 */
public class ExtraccionMitadCadena {

    public static void main(String[] args) {

        try {
            System.out.println(particionarCadenaMitad("Java")); // Ja
            System.out.println(particionarCadenaMitad("JavaScript")); // JavaS

            System.out.println();

            System.out.println(particionarCadenaMitad("PHP")); // Error
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static String particionarCadenaMitad(String texto) throws IllegalArgumentException {
        if (texto.length() % 2 == 0) {
            return texto.substring(0, texto.length() / 2);
        } else {
            throw new IllegalArgumentException("La cadena de caracteres suministrada (" + texto + ") no tiene longitud par.");
        }
    }
}
