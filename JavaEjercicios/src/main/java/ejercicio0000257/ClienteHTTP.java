package ejercicio0000257;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Ejercicio 257: Agregar encabezados a una solicitud creada con OkHttpClient.
 *
 * @author John Ortiz Ordoñez
 */
public class ClienteHTTP {

    public static void main(String[] args) throws IOException {
        
        final String URL = "http://localhost:9009/?nombre=java&version=8";
        
        OkHttpClient cliente = new OkHttpClient();
        
        Request request = new Request.Builder()
                .header("User-Agent", "Cliente Web OkHttpClient")
                .addHeader("Accept", "text/html")
                .url(URL)
                .build();
        
        try(Response response = cliente.newCall(request).execute()){
            
            System.out.println("Código respuesta: " + response.code());
            
            if (response.isSuccessful()){
                String respuesta = response.body().string();
                
                System.out.println(respuesta);
            }
        }
    }
}
