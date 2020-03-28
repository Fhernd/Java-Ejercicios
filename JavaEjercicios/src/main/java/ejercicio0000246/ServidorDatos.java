package ejercicio0000246;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Ejercicio 246: Crear un servidor TCP usando la clase ServerSocket.
 * 
 * @author John Ortiz Ordoñez
 */
public class ServidorDatos {

    public static void main(String[] args) throws IOException {
        
        final int PUERTO = 20064;
        
        try(ServerSocket listener = new ServerSocket(PUERTO)){
            
            System.out.println("El servidor se ha iniciado...");
            
            while(true){
                try(Socket socket = listener.accept()){
                    
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(),
                            true);
                    
                    pw.println(new Date().toString());
                }
            }
        }
    }
}
