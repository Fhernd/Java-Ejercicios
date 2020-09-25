package ejercicio0000380;

/**
 * Ejercicio 380: Explorar mecanismos de conversión de cadenas en valores 
 * numéricos reales.
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionCadenasNumerosReales {

    public static void main(String[] args) {
        
        // 1. Double.parseDouble(String): double
        String texto = "3.1415";
        double valorReal = Double.parseDouble(texto);
        System.out.println(valorReal);
        
        System.out.println();
        
        // 2. Double.valueOf(String): Double
        Double pi = Double.valueOf(texto);
        System.out.println(pi);
    }
}
