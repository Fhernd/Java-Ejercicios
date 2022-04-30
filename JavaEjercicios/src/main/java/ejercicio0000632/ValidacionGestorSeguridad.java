package ejercicio0000632;

/**
 * Ejercicio 632: Comprobar si el gestor de seguridad se haya configurado en el sistema.
 *
 * @author: John Ortiz Ordoñez
 */
public class ValidacionGestorSeguridad {
    public static void main(String[] args) {
        System.out.println("Gestor de seguridad:");
        System.out.println(System.getSecurityManager());
    }
}
