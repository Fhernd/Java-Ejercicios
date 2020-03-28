package ejercicio0000197;

import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Ejercicio 197: Hacer uso de excepciones para la gestión de errores de red.
 * 
 * @author John Ortiz Ordoñez
 */
public class ManejoErroresRed {

    public static void main(String[] args) {
        
        final String HOST = "localhost";
        final int PUERTO = 8383;
        
        try(Socket socket = new Socket(HOST, PUERTO)){
            
            System.out.println("Conectado a " + HOST);
            
            // Podría ocurrir un error I/O
            
        } catch(UnknownHostException e){
            System.err.printf("%s no es un host conocido.\n", HOST);
            
        } catch(NoRouteToHostException e){
            System.err.printf("%s no se ha podido alcanzar.\n", HOST);
            
        } catch(ConnectException e){
            System.err.println("La conexión se ha rechazado.");
            
        } catch(IOException e){
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
