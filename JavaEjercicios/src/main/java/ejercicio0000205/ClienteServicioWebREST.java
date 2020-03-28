package ejercicio0000205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Ejercicio 205: Crear una solicitud GET a una API usando la clase 
 * URLConnection.
 * 
 * @author John Ortiz Ordoñez
 */
public class ClienteServicioWebREST {

    public static void main(String[] args) {
        
        final String URL_API = "https://jsonplaceholder.typicode.com/todos/1";
        
        try {
            
            // Inicio de la conexión:
            URL url = new URL(URL_API);
            URLConnection conexion = url.openConnection();
            
            // Lectura del contenido de la respuesta:
            Reader r = new InputStreamReader(conexion.getInputStream());
            BufferedReader br = new BufferedReader(r);
            
            String linea;
            
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
            
        } catch (IOException e) {
            System.err.println("Error de I/O: " + e.getMessage());
        }
    }
}
