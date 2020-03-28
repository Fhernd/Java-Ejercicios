package ejercicio0000237;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Ejercicio 237: Crear una rutina para obtener recursos de traducción.
 * 
 * @author John Ortiz Ordoñez
 */
public class RutinaTraduccion {

    public static void main(String[] args) {
        
        ResourceBundle rb = ResourceBundle.getBundle("ejercicio0000237/Bundle");
        
        Scanner lector = new Scanner(System.in);
        
        System.out.printf("%s: ", obtenerCadena(rb, "console.get_name", "Escriba su nombre"));
        String nombre = lector.nextLine();
        
        System.out.printf("%s: ", obtenerCadena(rb, "console.get_email", "Escriba su correo"));
        String email = lector.nextLine();
    }
    
    public static String obtenerCadena(ResourceBundle rb, String llave, String valorPorDefecto){
        
        String resultado;
        
        try{
            resultado = rb.getString(llave);
            
        } catch(MissingResourceException e){
            resultado = valorPorDefecto;
        }
        
        return resultado;
    }
}
