package ejercicio0000199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Ejercicio 199: Obtener datos de un dominio usando un cliente whois basado 
 * sockets.
 *
 * @author John Ortiz Ordoñez
 */
public class DatosDominio {

    public static void main(String[] args) {
        
        final String DOMINIO = "whois.internic.net";
        final String DOMINIO_CONSULTA = "google.com";
        final int PUERTO = 43;
        
        try(Socket socket = new Socket(DOMINIO, PUERTO)){
            
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            pw.println(DOMINIO_CONSULTA);
            
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            String linea;
            
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
            
        } catch(UnknownHostException e){
            System.err.println("No se ha encontrado el servidor: " + e.getMessage());
            
        } catch(IOException e){
            System.err.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
