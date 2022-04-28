package ejercicio0000614;

/**
 * Ejercicio 614: Concatenar dos cadenas de caracteres con la regla cadenaCorta + cadenaLarga + cadenaCorta.
 *
 * @author: John Ortiz Ordoñez
 */
public class ConcatenacionCadenas {
    public static void main(String[] args) {
        // Python
        // Java
        // JavaPythonJava

        String texto1 = "Java";
        String texto2 = "Python";

        if (texto1.length() != texto2.length()) {
            if (texto1.length() < texto2.length()) {
                System.out.println(texto1 + texto2 + texto1);
            } else {
                System.out.println(texto2 + texto1 + texto2);
            }
        } else {
            System.out.println("Las cadenas tienen igual longitud.");
        }
    }
}
