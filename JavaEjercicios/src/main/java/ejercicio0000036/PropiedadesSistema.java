package ejercicio0000036;

import java.util.Properties;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class PropiedadesSistema {
    public static void main(String[] args){
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.arch"));
        
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("home"));
        
        System.out.println(System.getProperty("java.runtime.version"));
        
        Properties props = System.getProperties();
        
        props.list(System.out);
    }
}
