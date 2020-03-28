package ejercicio0000202;

import java.net.URL;

/**
 * Ejercicio 202: Validar una dirección URL con la clase incorporada URL.
 * 
 * @author John Ortiz Ordoñez
 */
public class ValidacionDireccionUrl {

    public static void main(String[] args) {
        
        String urlPrueba = "http://bit.ly/2SiCmCJ";
        
        System.out.printf("¿La URL %s es válida?: %b\n", urlPrueba, urlValida(urlPrueba));
        
        System.out.println();
        
        urlPrueba = "http:/bit.ly/2SiCmCJ";
        
        System.out.printf("¿La URL %s es válida?: %b\n", urlPrueba, urlValida(urlPrueba));
    }
    
    public static boolean urlValida(String url){
        
        try {
            (new URL(url)).openStream().close();
            
            return true;
        } catch (Exception e) {
        }
        
        return false;
    }
}
