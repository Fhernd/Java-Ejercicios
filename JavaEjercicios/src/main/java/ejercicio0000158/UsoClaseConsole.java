package ejercicio0000158;

import java.io.Console;

/**
 * Ejercicio 158: Uso de la clase Console.
 *
 * @author John Ortiz Ordoñez
 */
public class UsoClaseConsole {

    public static void main(String[] args) {

        Console c = System.console();

        if (c != null) {

            System.out.print("Escriba su nombre: ");
            String nombre = c.readLine();

            System.out.println("Su nombre es: " + nombre);
        } else {
            System.out.println("No hay una consola adjunta.");
        }
    }
}
