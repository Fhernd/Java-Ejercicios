package ejercicio0000389;

/**
 * Ejercicio 389: Comprobar si una cadena de caracteres termina con un texto
 * específico.
 *
 * @author John Ortiz Ordoñez
 */
public class TerminacionCadena {

    public static void main(String[] args) {
        
        String nombreArchivo = "usuarios.txt";
        
        if (nombreArchivo.endsWith(".txt")) {
            System.out.println("El nombre del archivo tiene la extensión .txt.");
        } else {
            System.out.println("El nombre del archivo no tiene la extensión .txt.");
        }
        
        System.out.println();
        
        nombreArchivo = "usuarios.TXT";
        
        if (nombreArchivo.endsWith(".txt")) {
            System.out.println("El nombre del archivo tiene la extensión .txt.");
        } else {
            System.out.println("El nombre del archivo no tiene la extensión .txt.");
        }
        
        System.out.println();
        
        if (nombreArchivo.toLowerCase().endsWith(".txt")) {
            System.out.println("El nombre del archivo tiene la extensión .txt.");
        } else {
            System.out.println("El nombre del archivo no tiene la extensión .txt.");
        }
    }
}
