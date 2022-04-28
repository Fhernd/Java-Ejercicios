package ejercicio0000618;

/**
 * Ejercicio 618: Sustituir todos los números de un texto por un carácter específico.
 *
 * @author: John Ortiz Ordoñez
 */
public class SustitucionNumeros {
    public static void main(String[] args) {
        String lenguaje = "Java 15 es una de las últimas versiones del lenguaje de programación. Una de las versiones más utilizadas es la 8.";
        System.out.println(lenguaje);

        System.out.println();

        System.out.println(lenguaje.replaceAll("\\d", "#"));
    }
}
