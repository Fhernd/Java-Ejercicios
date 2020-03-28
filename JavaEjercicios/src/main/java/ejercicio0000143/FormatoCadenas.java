package ejercicio0000143;

import java.util.Formatter;

/**
 * Ejercicio 143: Formatear cadenas de caracteres con printf y Formatter.
 * 
 * @author John Ortiz Ordoñez
 */
public class FormatoCadenas {

    public static void main(String[] args) {
        
        // printf
        System.out.println("Uso de printf:");
        
        System.out.printf("Valor de pi: %.4f\n\n", Math.PI);
        
        System.out.printf("Valor de pi: %.4f - Valor de Euler: %.3f\n\n", Math.PI, Math.E);
        
        System.out.printf("Valor de pi: %.4f - Valor de Euler: %.3f - Valor de Pi con dos decimales: %.2f\n\n", Math.PI, Math.E, Math.PI);
        
        System.out.printf("Valor de pi: %.4f - Valor de Euler: %.3f - Valor de Pi con dos decimales: %1$.2f\n\n", Math.PI, Math.E);
        
        // Formatter:
        System.out.println("Uso de la clase Formatter:");
        Formatter formatter = new Formatter();
        Object cadenaFormato = formatter.format("Valor de pi: %.4f%n", Math.PI);
        System.out.println(cadenaFormato);
        
        cadenaFormato = formatter.format("Valor de pi: %.4f - Valor de Euler: %.3f - Valor de Pi con dos decimales: %1$.2f%n%n", Math.PI, Math.E);
        
        System.out.println(cadenaFormato);
    }
}
