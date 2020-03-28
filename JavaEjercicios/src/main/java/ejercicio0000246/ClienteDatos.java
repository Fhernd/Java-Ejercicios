package ejercicio0000246;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class ClienteDatos {

    public static void main(String[] args) throws IOException{
        
        final int PUERTO = 20064;
        
        Socket socket = new Socket("localhost", PUERTO);
        Scanner entrada = new Scanner(socket.getInputStream());
        
        System.out.println("Respuesta desde el servidor: " + 
                entrada.nextLine());
    }
}
