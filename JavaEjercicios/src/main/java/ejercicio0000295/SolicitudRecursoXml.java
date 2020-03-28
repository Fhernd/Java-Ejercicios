package ejercicio0000295;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Ejercicio 295: Realizar una solicitud GET a un recurso que retorne XML.
 * 
 * @author John Ortiz Ordoñez
 */
public class SolicitudRecursoXml {

    public static void main(String[] args) {
        String url = "https://randomuser.me/api/?results=5&format=XML";
        
        OkHttpClient cliente = new OkHttpClient();
        
        Request solicitud = new Request.Builder().url(url).build();
        
        try(Response respuesta = cliente.newCall(solicitud).execute()){
            System.out.println("Código de respuesta: " + respuesta.code());
            
            if(respuesta.isSuccessful()){
                String respuestaXml = respuesta.body().string();
                
                System.out.println(respuestaXml);
            }
        } catch (IOException ex) {
            Logger.getLogger(SolicitudRecursoXml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
