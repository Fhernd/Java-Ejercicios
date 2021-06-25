package ejercicio0000573;

/**
 * Ejercicio 573: Iterar en sentido inverso (derecha-izquierda) los caracteres de una cadena.
 *
 * @author John Ortiz Ordoñez.
 */
public class RecorridoInversoCadena {

    public static void main(String[] args) {
        
        String texto = "Java es un lenguaje de programación.";
        System.out.println(texto);

        System.out.println();
        
        String resultado = leerSentidoInverso(texto);
        System.out.println(resultado);
    }
    
    public static String leerSentidoInverso(String texto) {
        String resultado = "";
        
        for (int i = texto.length() - 1; i >= 0; --i) {
            resultado += texto.charAt(i);
        }
        
        return resultado;
    }
}
