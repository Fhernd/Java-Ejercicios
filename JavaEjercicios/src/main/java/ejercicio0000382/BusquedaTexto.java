package ejercicio0000382;

/**
 * Ejercicio 382: Usar el método matches() para buscar coincidencias de texto.
 *
 * @author John Ortiz Ordoñez
 */
public class BusquedaTexto {

    public static void main(String[] args) {
        
        String frase = "¡Java es tremendo!";
        
        boolean resultado = frase.matches("¡Java es tremendo!");    // true
        System.out.println(resultado);
        
        System.out.println();
        
        resultado = frase.matches("Java es tremendo");  // false
        System.out.println(resultado);
        
        System.out.println();
        
        resultado = frase.matches("¡java es tremendo!");  // false
        System.out.println(resultado);
    }
}
