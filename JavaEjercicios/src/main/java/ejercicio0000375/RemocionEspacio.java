package ejercicio0000375;

/**
 * Ejercicio 375: Remover el espacio en blanco al inicio y al final de una 
 * cadena con la función trim().
 *
 * @author John Ortiz Ordoñez
 */
public class RemocionEspacio {

    public static void main(String[] args) {
        
        String frase = "         ¡Java es tremendo!      ";
        System.out.println(frase);
        System.out.println(frase.length());
        
        System.out.println("---------------");
        
        System.out.println(frase.trim());
        System.out.println(frase.trim().length());
        
        System.out.println("---------------");
        
        frase = "   \t   \n      Java\t\t\n\t     ";
        System.out.println(frase);
        System.out.println(frase.length());
        
        System.out.println("---------------");
        
        System.out.println(frase.trim());
        System.out.println(frase.trim().length());
    }
}
