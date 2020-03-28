package ejercicio0000198;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Ejercicio 198: Leer datos a través de la red con un objeto Socket.
 *
 * @author John Ortiz Ordoñez
 */
public class LecturaDatosSocket {

    public static void main(String[] args) {
        final String HOST = "time-a-g.nist.gov";
        final int PUERTO = 13;
        
        try(Socket socket = new Socket(HOST, PUERTO)){
            
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            
            int caracter;
            StringBuilder datos = new StringBuilder();
            
            while((caracter = isr.read()) != -1){
                datos.append((char) caracter);
            }
            
            System.out.printf("La hora en %s es %s\n", HOST, datos);
            
        } catch(IOException e){
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
