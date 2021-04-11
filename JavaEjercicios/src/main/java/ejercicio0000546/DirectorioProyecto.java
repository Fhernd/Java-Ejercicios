package ejercicio0000546;

/**
 * Ejercicio 546: Obtener la ruta del directorio del proyecto actual con System.getProperty().
 *
 * @author John Ortiz Ordoñez.
 */
public class DirectorioProyecto {

    public static void main(String[] args) {
        
        String rutaProyecto = System.getProperty("user.dir");
        
        System.out.println(rutaProyecto);
    }
}
