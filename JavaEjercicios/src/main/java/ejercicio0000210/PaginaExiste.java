package ejercicio0000210;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Ejercicio 210: Comprobar por medio de HttpURLConnection si una dirección URL
 * Web existe.
 *
 * @author John Ortiz Ordoñez
 */
public class PaginaExiste {

    public static void main(String[] args) {

        final String DIRECCION_WEB = "https://ortisol.blogspot.com";
        
        try {
            
            URL url = new URL(DIRECCION_WEB);
            
            HttpURLConnection.setFollowRedirects(false);
            HttpURLConnection conexion = (HttpURLConnection)
                    url.openConnection();
            conexion.setRequestMethod("HEAD");
            
            System.out.printf("¿Dirección existe?: %b\n", 
                    conexion.getResponseCode() == HttpURLConnection.HTTP_OK);
            
        } catch (IOException e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
