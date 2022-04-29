package ejercicio0000620;

/**
 * Ejercicio 620: Remover todas las consonantes de un texto con una expresión regular.
 *
 * @author: John Ortiz Ordoñez
 */
public class RemocionConsonantes {
    public static void main(String[] args) {
        String lenguaje = "Java";
        System.out.println(lenguaje);

        System.out.println();

        String resultado = lenguaje.replaceAll("[^aeiouAEIOU]", "");
        System.out.println(resultado);  // aa

        System.out.println();

        System.out.println("Lenguaje".replaceAll("[^aeiouAEIOU]", "")); // euae
    }
}
