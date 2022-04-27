package ejercicio0000611;

/**
 * Ejercicio 611: Insertar una cadena de caracteres en la mitad de otra cadena de caracteres.
 *
 * @author: John Ortiz Ordoñez
 */
public class InsercionCadena {

    public static void main(String[] args) {
        String frase = "Java SDK";
        System.out.println(frase);

        System.out.println();

        String version = "15";

        String[] palabras = frase.split(" ");
        String resultado = palabras[0] + " " + version + " " + palabras[1];
        System.out.println(resultado);
    }
}
