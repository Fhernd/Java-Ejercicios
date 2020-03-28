package ejercicio0000201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Ejercicio 201: Crear un cliente SMTP con sockets.
 * 
 * @author John Ortiz Ordoñez
 */
public class ClienteSmtpSocket {

    public static void main(String[] args) {
        
        final String HOST_SMTP = "smtp.gmail.com";
        final int PUERTO = 25;
        
        try (Socket socket = new Socket(HOST_SMTP, PUERTO)) {
            
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            
            // Resultado de solicitud de conexión:
            String linea = br.readLine();
            System.out.println(linea);
            
            System.out.println("");
            
            // Mensaje de inicio de sesión:
            pw.println("helo " + HOST_SMTP);
            linea = br.readLine();
            System.out.println(linea);
            
            System.out.println("");
            
            // Cerrar conexión:
            pw.println("quit");
            linea = br.readLine();
            System.out.println(linea);
            
        } catch (UnknownHostException e) {
            System.err.println("Servidor no encontrado: " + e.getMessage());
            
        } catch(IOException e){
            System.err.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
