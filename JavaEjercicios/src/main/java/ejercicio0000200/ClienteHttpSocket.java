package ejercicio0000200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * Ejercicio 200: Crear un cliente HTTP basado en sockets.
 *
 * @author John Ortiz Ordoñez
 */
public class ClienteHttpSocket {

    public static void main(String[] args) {
        
        final String DIRECCION = "http://bit.ly/2SiCmCJ";
        
        URL url;
        
        try {
            url = new URL(DIRECCION);
        } catch (MalformedURLException e) {
            System.err.println("Error en la dirección. NO está bien formada.");
            return;
        }
        
        String host = url.getHost();
        final int PUERTO = 80;
        
        try(Socket socket = new Socket(host, PUERTO)){
            
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            
            pw.println("HEAD " + url.getPath() + " HTTP/1.1");
            pw.println("Host: " + host);
            pw.println("User-Agent: Cliente HTTP Basico");
            pw.println("Accept: text/html");
            pw.println("Accept-Language: en-US");
            pw.println("Connection: close");
            pw.println();
            
            // Lectura de la respuesta del servidor:
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            String linea;
            
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
            
        } catch(UnknownHostException e){
            System.err.println("No se encontró el servidor: " + e.getMessage());
            
        } catch(IOException e){
            System.err.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
