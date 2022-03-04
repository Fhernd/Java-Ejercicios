package ejercicio0000601;

import java.util.Scanner;

/**
 * Ejercicio 601: Capitalizar una frase utilizando una función personalizada.
 *
 * @author John Ortiz Ordoñez.
 */
public class CapitalizacionTexto {

    public static void main(String[] args) {
        // java es un lenguaje de programación
        // Java Es Un Lenguaje De Programación
        
        String frase = "java es un lenguaje de programación";
        String resultado = capitalizar(frase);
        
        System.out.println(frase);
        System.out.println(resultado);
    }
    
    public static String capitalizar(String frase) {
        Scanner lecturaTexto = new Scanner(frase);
        String resultado = "";
        String palabra;
        
        while(lecturaTexto.hasNext()) {
            palabra = lecturaTexto.next();
            
            resultado += Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1) + " ";
        }
        
        return resultado;
    }
}
