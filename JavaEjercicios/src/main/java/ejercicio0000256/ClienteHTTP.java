package ejercicio0000256;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Ejercicio 256: Hacer una solicitud desde un cliente OkHttpClient.
 *
 * @author John Ortiz Ordoñez
 */
public class ClienteHTTP {

    public static void main(String[] args) throws IOException {
        
        final String URL = "https://randomuser.me/api/?results=2&format=xml";
        
        OkHttpClient cliente = new OkHttpClient();
        
        Request request = new Request.Builder()
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
