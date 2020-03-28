package ejercicio0000076;

import java.text.NumberFormat;

/**
 * Ejercicio 76: Formatear números con la clase NumberFormat.
 * 
 * @author John Ortiz Ordoñez
 */
public class FormatearNumeros {
    public static void main(String[] args) {
        double[] numeros = {0, 1, 23D/5, 100.2345578};
        
        NumberFormat nf = NumberFormat.getInstance();
        
        nf.setMinimumIntegerDigits(3);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(4);
        
        for (double numero : numeros) {
            System.out.printf("%f -> %s\n", numero, nf.format(numero));
        }
    }
}
