package ejercicio0000209;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Ejercicio 209: Obtener el nombre del host local usando la clase 
 * InetAddress.
 * 
 * @author John Ortiz Ordoñez
 */
public class HostLocal {

    public static void main(String[] args) {
        
        try {
            
            InetAddress direccion = InetAddress.getLocalHost();
            
            System.out.println("El nombre del host local es: " + 
                    direccion.getHostName());
            
        } catch (UnknownHostException e) {
            System.err.println("No fue posible determinar el nombre del host local.");
        }
    }
}
