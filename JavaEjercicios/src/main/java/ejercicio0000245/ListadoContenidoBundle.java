package ejercicio0000245;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * Ejercicio 245: Obtener el listado de llaves y valores de un archivo bundle 
 * de traducción.
 * 
 * @author John Ortiz Ordoñez
 */
public class ListadoContenidoBundle {

    public static void main(String[] args) {
        
        ResourceBundle rb = ResourceBundle.getBundle("ejercicio0000245/Bundle");
        
        Enumeration<String> llaves = rb.getKeys();
        String llave;
        
        while(llaves.hasMoreElements()){
            llave = llaves.nextElement();
            
            System.out.printf("%s: %s\n", llave, rb.getString(llave));
        }
    }
}
