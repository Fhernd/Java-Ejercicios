package ejercicio0000204;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/**
 * Ejercicio 204: Codificar y leer el contenido de una página Web con 
 * URLConnection e InputStream.
 * 
 * @author John Ortiz Ordoñez
 */
public class LecturaContenidoHtml {

    public static void main(String[] args) {
        
        final String DIRECCION = "http://www.google.com";
        String codificacion = StandardCharsets.ISO_8859_1.toString();
        
        try {
            
            URL url = new URL(DIRECCION);
            URLConnection conexion = url.openConnection();
            
            // Determinación del tipo de codificación:
            String tipoContenido = conexion.getContentType();
            int indiceInicioCodificacion = tipoContenido.indexOf("charset=");
            
            if (indiceInicioCodificacion != -1){
                codificacion = tipoContenido.substring(indiceInicioCodificacion + 8);
            }
            
            // Lectura del contenido del documento HTML:
            InputStream is = new BufferedInputStream(conexion.getInputStream());
            Reader r = new InputStreamReader(is, codificacion);
            int caracter;
            
            while((caracter = r.read()) != -1){
                System.out.print((char) caracter);
            }
            
        } catch (MalformedURLException e) {
            System.err.println("La URL está mal formada.");
            
        } catch (IOException e){
            System.err.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
