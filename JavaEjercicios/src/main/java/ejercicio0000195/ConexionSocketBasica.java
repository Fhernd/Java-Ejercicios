package ejercicio0000195;

import java.net.Socket;

/**
 * Ejercicio 195: Crear una conexión socket a un servidor vía TCP/IP.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConexionSocketBasica {

    public static void main(String[] args) {
        
        final String HOST = "localhost";
        final int PUERTO = 8383;
        
        try(Socket socket = new Socket(HOST, PUERTO)){
            
            System.out.println("Conexión OK");
            
        } catch(Exception e){
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
