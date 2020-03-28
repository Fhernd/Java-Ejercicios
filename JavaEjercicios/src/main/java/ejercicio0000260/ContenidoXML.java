package ejercicio0000260;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Ejercicio 260: Enviar una solicitud GET hacia un recurso que retorne XML.
 * 
 * @author John Ortiz Ordoñez
 */
public class ContenidoXML {

    public static void main(String[] args) throws IOException{
        
        final String URL = "https://raw.githubusercontent.com/GoogleCloudPlatform/cloud-storage-docs-xml-api-examples/master/storage-serviceaccount-cmdline-sample/pom.xml";
        
        OkHttpClient cliente = new OkHttpClient();
        
        Request request = new Request.Builder()
                .header("User-Agent", "Cliente Web OkHttpClient")
                .addHeader("Accept", "application/xml")
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
