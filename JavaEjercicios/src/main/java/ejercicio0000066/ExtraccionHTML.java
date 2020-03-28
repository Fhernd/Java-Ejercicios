package ejercicio0000066;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ejercicio 66: Extraer etiquetas y su contenido desde un 
 * documento HTML.
 *
 * @author John Ortiz Ordoñez
 */
public class ExtraccionHTML {

    public static void main(String[] args) {
        String html = "<html>\n"
                + "<head>\n"
                + "<title>Título de la página</title>\n"
                + "</head>\n"
                + "<body bgcolor=white>\n"
                + "<h1>Párrafo</h1>\n"
                + "<p>Primer parráfo</p>\n"
                + "<p><a href=\"https://ortizol.blogspot.com.com/\">Link</a> OrtizOL</p>\n"
                + "<!-- Comentario-->\n"
                + "<span>Texto breve...</span>\n"
                + "<p>Java es un lenguaje de programación</p>\n"
                + "</body>\n"
                + "</html>";
        
        String patron = "<p>.*?</p>";
        
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(html);
        
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
