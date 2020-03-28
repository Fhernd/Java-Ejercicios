package ejercicio0000079;

import java.time.LocalDate;

/**
 * Ejercicio 79: Generar la representación del año actual en 
 * número romano.
 * 
 * @author John Ortiz Ordoñez
 */
public class GeneracionNumerosRomanos {
    public static void main(String[] args) {
        RomanNumberFormat nf = new RomanNumberFormat();
        int año = LocalDate.now().getYear();
        
        System.out.printf("%d -> %s\n", año, nf.format(año));
    }
}
