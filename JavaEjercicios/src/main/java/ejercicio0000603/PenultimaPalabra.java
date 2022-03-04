package ejercicio0000603;

/**
 * Ejercicio 603: Obtener la penúltima palabra de una frase con una función.
 *
 * @author John Ortiz Ordoñez.
 */
public class PenultimaPalabra {

    public static void main(String[] args) {
        System.out.println(obtenerPenultimaPalabra("Java"));
        
        System.out.println();
        
        System.out.println(obtenerPenultimaPalabra("Java es un lenguaje de programación"));
    }
    
    public static String obtenerPenultimaPalabra(String frase) {
        String[] palabras = frase.split(" ");
        
        if (palabras.length == 1) {
            return null;
        }
        
        return palabras[palabras.length - 2];
    }
}
