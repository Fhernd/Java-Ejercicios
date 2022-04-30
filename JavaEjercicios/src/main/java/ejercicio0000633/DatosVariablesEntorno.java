package ejercicio0000633;

/**
 * Ejercicio 633: Obtener las propiedades de entorno para el PATH, TEMP y USERNAME.
 *
 * @author: John Ortiz Ordoñez
 */
public class DatosVariablesEntorno {
    public static void main(String[] args) {
        System.out.println("Variable de entorno PATH:");
        System.out.println(System.getenv("PATH"));

        System.out.println();
        System.out.println();

        System.out.println("Variable de entorno TEMP:");
        System.out.println(System.getenv("TEMP"));

        System.out.println();
        System.out.println();

        System.out.println("Variable de entorno USERNAME:");
        System.out.println(System.getenv("USERNAME"));
    }
}
