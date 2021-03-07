package ejercicio0000520;

import java.util.Scanner;

/**
 * Ejercicio 520: Definir una función para capitalizar la primera letra de cada palabra en una frase.
 *
 * @author John Ortiz Ordoñez
 */
public class CambioCapitalizacion {

    public static void main(String[] args) {
        
        String frase = "Java es un lenguaje de programación orientado a objetos.";
        System.out.println(frase);
        
        System.out.println();
        
        String resultado = capitalizarFrase(frase);
        System.out.println(resultado);
    }
    
    public static String capitalizarFrase(String frase) {
        
        String capitalizacion = "";
        Scanner contenido = new Scanner(frase);
        
        while(contenido.hasNext()) {
            String palabra = contenido.next();
            
            capitalizacion += Character.toUpperCase(palabra.charAt(0));
            capitalizacion += palabra.substring(1) + " ";
        }
        
        return capitalizacion;
    }
}
