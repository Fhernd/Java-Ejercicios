package ejercicio0000376;

/**
 * Ejercicio 376: Cambiar de la capitalización (mayúsculas y minúsculas) de 
 * una cadena de caracteres.
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionCadenas {

    public static void main(String[] args) {
        
        String frase = "¡Java es tremendo!";
        System.out.println(frase);
        
        System.out.println();
        
        System.out.println(frase.toLowerCase()); // ¡java es tremendo!
        
        System.out.println();
        
        System.out.println(frase.toUpperCase()); // ¡JAVA ES TREMENDO!
    }
}
