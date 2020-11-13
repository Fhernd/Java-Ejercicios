package ejercicio0000430;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Ejercicio 430: Usar la clase Calendar para obtener la diferencia entre 
 * dos fechas distintas.
 *
 * @author John Ortiz Ordoñez
 */
public class CalendarioDiferencia {

    public static void main(String[] args) {
        
        Calendar calendario1 = Calendar.getInstance();
        Calendar calendario2 = Calendar.getInstance();
        
        calendario2.set(2000, 0, 1, 7, 0);
        Date fecha = calendario2.getTime();
        
        long diferenciaMilisegundos = Math.abs(calendario1.getTimeInMillis() - fecha.getTime());
        
        long horas = TimeUnit.MILLISECONDS.toHours(diferenciaMilisegundos);
        System.out.printf("La diferencia en horas entre %s y %s es igual a %d\n", calendario1.getTime(), calendario2.getTime(), horas);
        
        System.out.println();
        
        long dias = TimeUnit.MILLISECONDS.toDays(diferenciaMilisegundos);
        System.out.printf("La diferencia en días entre %s y %s es igual a %d\n", calendario1.getTime(), calendario2.getTime(), dias);
    }
}
