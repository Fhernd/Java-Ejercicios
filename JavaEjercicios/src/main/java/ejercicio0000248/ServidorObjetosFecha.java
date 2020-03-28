package ejercicio0000248;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Ejercicio 248: Crear un servidor con ServerSocket para enviar objetos a 
 * un cliente.
 * 
 * @author John Ortiz Ordoñez
 */
public class ServidorObjetosFecha {
    
    public static void main(String[] args) {
        
        final int PUERTO = 20064;
        ServerSocket socket;
        Socket socketCliente;
        
        try {
            
            socket = new ServerSocket(PUERTO);
            
            while ((socketCliente = socket.accept()) != null){
                
                System.out.println("Conexión desde: " + 
                        socketCliente.getInetAddress());
                
                ObjectOutputStream os = new ObjectOutputStream(socketCliente.getOutputStream());
                
                os.writeObject(new Date());
                
                os.close();
            }
            
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
