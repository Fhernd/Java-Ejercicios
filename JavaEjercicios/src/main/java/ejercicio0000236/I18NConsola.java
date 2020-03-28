package ejercicio0000236;

import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Ejercicio 236: Implementar internacionalización en una aplicación tipo 
 * consola con la clase ResourceBundle.
 * 
 * @author John Ortiz Ordoñez
 */
public class I18NConsola {

    public static void main(String[] args) {
        
        ResourceBundle rb = ResourceBundle.getBundle("ejercicio0000236/Bundle");
        
        Scanner lector = new Scanner(System.in);
        
        System.out.printf("%s: ", rb.getString("console.get_name"));
        String nombre = lector.nextLine();
        
        System.out.printf("%s: ", rb.getString("console.get_email"));
        int edad = lector.nextInt();
    }
}
