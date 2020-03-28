package ejercicio0000254;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;

/**
 * Ejercicio 254: Obtener información de la solicitud GET realizada por el 
 * cliente (navegador Web).
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
        mostrarInformacionSolicitud(exchange);
        exchange.sendResponseHeaders(CODIGO_RESPUESTA, contenido.getBytes().length);
        
        OutputStream os = exchange.getResponseBody();
        
        os.write(contenido.getBytes());
        os.close();
    }
    
    // TODO: crear método para mostrar información de solicitud
    private static void mostrarInformacionSolicitud(HttpExchange exchange){
        
        System.out.println("Encabezados:");
        exchange.getRequestHeaders().entrySet()
                .forEach(System.out::println);
        
        System.out.println();
        
        System.out.println("Método: " + exchange.getRequestMethod());
        
        System.out.println();
        
        System.out.println("Query:");
        URI uri = exchange.getRequestURI();
        System.out.println(uri.getQuery());
    }
}
