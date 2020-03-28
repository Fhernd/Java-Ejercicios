package ejercicio0000038;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class VersionJDK {
    public static void main(String[] args){
        String versionJDK = System.getProperty("java.specification.version");
        
        System.out.println(versionJDK);
    }
}
