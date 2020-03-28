package ejercicio0000258;

import java.io.IOException;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Ejercicio 258: Enviar una solicitud tipo POST para búsqueda en Wikipedia.
 *
 * @author John Ortiz Ordoñez
 */
public class SolicitudPOST {

    public static void main(String[] args) throws IOException {
        
        final String URL = "https://en.wikipedia.org/w/index.php";
        
        OkHttpClient clienteHttp = new OkHttpClient();
        
        RequestBody bodyForm = new FormBody.Builder()
                .add("search", "Java Programming")
                .build();
        
        Request solicitud = new Request.Builder()
                .url(URL)
                .post(bodyForm)
                .build();
        
        try(Response respuesta = clienteHttp.newCall(solicitud).execute()){
            
            if (respuesta.isSuccessful()){
                
                System.out.println(respuesta.body().string());
            } else {
                
                throw new IOException("Código de error: " + respuesta.code());
            }
        }
    }
}
