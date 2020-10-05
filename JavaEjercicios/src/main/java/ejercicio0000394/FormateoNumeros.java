package ejercicio0000394;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Ejercicio 394: Usar NumberFormat para formatear valores numéricos de punto
 * flotante.
 *
 * @author John Ortiz Ordoñez
 */
public class FormateoNumeros {

    public static void main(String[] args) {
        
        double numero = 123.45678;
        String resultado = formatearPuntoFlotante(numero);
        System.out.println(resultado);  // 123.457
        
        System.out.println();
        
        numero = 0.6397;
        resultado = formatearPuntoFlotante(numero);
        System.out.println(resultado);  // 0.640
    }
    
    public static String formatearPuntoFlotante(double numero) {
        NumberFormat numberFormat = new DecimalFormat("##.000");
        
        return numberFormat.format(numero);
    }
}
