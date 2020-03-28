package ejercicio0000203;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Ejercicio 203: Obtener el protocolo, el host, el puerto y la ruta a 
 * partir de una URL.
 * 
 * @author John Ortiz Ordoñez
 */
public class ProtocoloHostPuertoPathUrl {

    public static void main(String[] args) {
        
        final String DIRECCION_URL = "http://bit.ly:80/2SiCmCJ";
        
        try {
            
            URL url = new URL(DIRECCION_URL);
            
            System.out.println("Protocolo: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Puerto: " + url.getPort());
            System.out.println("Ruta: " + url.getPath());
            
        } catch (MalformedURLException e) {
            System.err.println("La URL no está bien formada.");
        }
    }
}
