package ejercicio0000259;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Ejercicio 259: Enviar una solicitud GET un recurso que retorne JSON.
 * 
 * @author John Ortiz Ordoñez
 */
public class ContenidoJSON {

    public static void main(String[] args) throws IOException{
        
        final String URL = "https://jsonplaceholder.typicode.com/todos/1";
        
        OkHttpClient cliente = new OkHttpClient();
        
        Request request = new Request.Builder()
                .header("User-Agent", "Cliente Web OkHttpClient")
                .addHeader("Accept", "application/json")
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
