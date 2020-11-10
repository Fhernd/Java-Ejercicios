package ejercicio0000428;

import java.time.LocalDate;
import java.time.Month;

/**
 * Ejercicio 428: Comparar fechas usando el método compareTo() de la clase 
 * LocalDate.
 *
 * @author John Ortiz Ordoñez
 */
public class ComparacionFechas {

    public static void main(String[] args) {
        
        LocalDate primeraFecha = LocalDate.of(2019, Month.JANUARY, 1);
        LocalDate segundaFecha = LocalDate.of(2020, Month.JANUARY, 1);
        LocalDate terceraFecha = LocalDate.of(2020, Month.JANUARY, 1);
        
        if (primeraFecha.compareTo(segundaFecha) < 0) {
            System.out.println("La fecha " + primeraFecha + " es menor a " + segundaFecha);
        }
        
        if (terceraFecha.compareTo(segundaFecha) == 0) {
            System.out.println("La fecha " + terceraFecha + " es igual a " + segundaFecha);
        }
        
        if (segundaFecha.compareTo(primeraFecha) > 0) {
            System.out.println("La fecha " + segundaFecha + " es mayor a " + primeraFecha);
        }
    }
}
