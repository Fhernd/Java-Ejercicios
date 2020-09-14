package ejercicio0000370;

/**
 * Ejercicio 370: Crear una porción de una cadena (texto) con el método 
 * substring().
 *
 * @author John Ortiz Ordoñez
 */
public class Subcadena {

    public static void main(String[] args) {
        
        String frase = "Java es un lenguaje de programación.";
        System.out.println(frase);
        
        String java = frase.substring(0, 4);
        System.out.println(java);
        System.out.println(java.length());
        
        System.out.println();
        
        String lenguaje = frase.substring(23);
        System.out.println(lenguaje);
        
        System.out.println();
        
        lenguaje = frase.substring(frase.indexOf("p"));
        System.out.println(lenguaje);
    }
}
