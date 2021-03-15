package ejercicio0000528;

/**
 * Ejercicio 528: Insertar un texto específico en una cadena de caracteres existente.
 *
 * @author John Ortiz Ordoñez
 */
public class InsercionTextoCadena {

    public static void main(String[] args) {
        
        String frase = "Python 3.9.2";
        System.out.println(frase);
        
        System.out.println();
        
        String textoAdicional = "versión";
        
        // Python versión 3.9.2
        frase = frase.substring(0, 6) + " " + textoAdicional + " " + frase.substring(frase.indexOf("3"));
        System.out.println(frase);
    }
}
