package ejercicio0000257;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import okhttp3.HttpUrl;

/**
 * Ejercicio 257
 * 
 * @author John Ortiz Ordoñez
 */
public class ServidorHTTP {

    public static void main(String[] args) throws IOException {

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
    private static void mostrarInformacionSolicitud(HttpExchange exchange) {

        System.out.println("Encabezados:");
        exchange.getRequestHeaders().entrySet()
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Método: " + exchange.getRequestMethod());

        System.out.println();

        System.out.println("Query:");
        URI uri = exchange.getRequestURI();
        System.out.println(uri.getQuery());
        
        leerParametrosQuery(exchange);
    }

    // TODO: Crear método para leer los parámetros de un query
    private static void leerParametrosQuery(HttpExchange exchange) {

        String requestedURL = "http://" + exchange.getRequestHeaders().getFirst("Host") + exchange.getRequestURI();

        HttpUrl url = HttpUrl.parse(requestedURL);

        if (url != null) {

            for (int i = 0; i < url.querySize(); i++) {

                System.out.printf("%s: %s\n", url.queryParameterName(i), url.queryParameterValue(i));
            }
        }
    }
}
