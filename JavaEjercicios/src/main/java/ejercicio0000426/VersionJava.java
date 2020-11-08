package ejercicio0000426;

/**
 * Ejercicio 426: Obtener la versión actual instalada de Java usando código.
 *
 * @author John Ortiz Ordoñez
 */
public class VersionJava {

    public static void main(String[] args) {
        
        int version = obtenerVersionJava();
        
        System.out.println("La versión actual de Java es: " + version);
    }
    
    public static int obtenerVersionJava() {
        String version = System.getProperty("java.version");
    
        if (version.startsWith("1.")) {
            version = version.substring(2, 3);
        } else {
            int indicePunto = version.indexOf(".");
            if (indicePunto != -1) {
                version = version.substring(0, indicePunto);
            }
        }
        
        return Integer.parseInt(version);
    }
    
}
