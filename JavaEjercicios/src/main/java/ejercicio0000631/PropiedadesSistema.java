package ejercicio0000631;

/**
 * Ejercicio 631: Mostrar las propiedades de entorno y de sistema usando la clase System.
 *
 * @author: John Ortiz Ordoñez
 */
public class PropiedadesSistema {
    public static void main(String[] args) {
        System.out.println("Propiedades de entorno:");
        System.out.println(System.getenv());

        System.out.println();
        System.out.println();

        System.out.println("Propiedades de sistema:");
        System.out.println(System.getProperties());
    }
}
