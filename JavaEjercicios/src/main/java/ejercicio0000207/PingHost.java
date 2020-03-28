package ejercicio0000207;

import java.io.IOException;
import java.net.InetAddress;

/**
 * Ejercicio 207: Hacer ping a un host remoto con la clase InetAddress.
 * 
 * @author John Ortiz Ordoñez
 */
public class PingHost {

    public static void main(String[] args) {
        
        final String HOST = "71.80.14.31";
        
        try {
            
            InetAddress direccion = InetAddress.getByName(HOST);
            
            boolean alcanzable = direccion.isReachable(10000);
            
            System.out.println("¿El host es alcanzable?: " + alcanzable);
            
        } catch (IOException e) {
            
            System.err.println("Ocurrió un error de entrada/salida: " + 
                    e.getMessage());
        }
    }
}
