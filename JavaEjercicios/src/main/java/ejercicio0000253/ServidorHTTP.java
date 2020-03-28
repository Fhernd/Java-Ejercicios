package ejercicio0000253;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

/**
 * Ejercicio 253: Crear un servidor HTTP para responder a una solicitud GET.
 * 
 * @author John Ortiz Ordoñez
 */
public class ServidorHTTP {

    public static void main(String[] args) throws IOException{
        
        final int PUERTO = 9009;
        HttpServer httpd = HttpServer.create(new InetSocketAddress(PUERTO), 0);        
        HttpContext ctx = httpd.createContext("/");
        ctx.setHandler(ServidorHTTP::gestionarSolicitud);
        
        httpd.start();
    }
    
    private static void gestionarSolicitud(HttpExchange exchange) throws IOException {
        final int CODIGO_RESPUESTA = 200;
        String contenido = "Respuesta desde el servidor HTTP";
        
        exchange.sendResponseHeaders(CODIGO_RESPUESTA, contenido.getBytes().length);
        
        OutputStream os = exchange.getResponseBody();
        
        os.write(contenido.getBytes());
        os.close();
    }
}
