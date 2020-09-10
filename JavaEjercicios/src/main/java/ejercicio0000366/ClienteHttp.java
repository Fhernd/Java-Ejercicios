package ejercicio0000366;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Ejercicio 366: Crear una solicitud a una página Web utilizando HttpClient.
 *
 * @author John Ortiz Ordoñez
 */
public class ClienteHttp {
    
    public static void main(String[] args) {
        
        try {
            HttpClient cliente = HttpClient.newHttpClient();
            
            HttpRequest solicitud = HttpRequest.newBuilder(URI.create("https://ortizol.blogspot.com")).build();
            
            HttpResponse respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
            
            System.out.println(respuesta.body());
        } catch (Exception e) {
        }
    }
}
