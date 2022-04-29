package ejercicio0000619;

/**
 * Ejercicio 619: Remover todas las vocales de un texto con una expresión regular.
 *
 * @author: John Ortiz Ordoñez
 */
public class RemocionVocales {
    public static void main(String[] args) {
        String lenguaje = "Java";
        System.out.println(lenguaje);   // Java

        System.out.println();

        String resultado = lenguaje.replaceAll("[aeiouAEIOU]", "");
        System.out.println(resultado);  // Jv

        System.out.println();

        System.out.println("Lenguaje".replaceAll("[aeiouAEIOU]", ""));  // Lngj
    }
}
