package ejercicio0000206;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Ejercicio 206: Escanear los puertos en el rango bajo 1 a 1024.
 * 
 * @author John Ortiz Ordoñez
 */
public class EscanerPuertosBajo {

    public static void main(String[] args) {
        
        final String HOST = "localhost";
        
        for (int puerto = 0; puerto < 1024; puerto++) {
            
            try {
                
                new Socket(HOST, puerto);
                
                System.out.printf("En el puerto %d hay un servidor %s.\n", 
                        puerto, HOST);
                
            } catch (UnknownHostException e) {
                System.err.println("El host no es conocido.");
                break;
                
            } catch (IOException e){}
            
        }
    }
}
