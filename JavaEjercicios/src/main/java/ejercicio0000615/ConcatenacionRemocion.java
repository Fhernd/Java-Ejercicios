package ejercicio0000615;

/**
 * Ejercicio 615: Concatenar dos cadenas removiendo el primer carácter de cada una.
 *
 * @author: John Ortiz Ordoñez
 */
public class ConcatenacionRemocion {
    public static void main(String[] args) {
        System.out.println(concatenar("Colombia", "Alemania")); // olombialemania
        System.out.println(concatenar("moneda", "cara")); // onedaara
    }

    public static String concatenar(String texto1, String texto2) {
        return texto1.substring(1) + texto2.substring(1);
    }
}
