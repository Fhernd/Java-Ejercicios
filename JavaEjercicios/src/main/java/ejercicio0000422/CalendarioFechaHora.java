package ejercicio0000422;

import java.util.Calendar;

/**
 * Ejercicio 422: Usar la clase Calendar para obtener los datos de la fecha 
 * y hora actual.
 *
 * @author John Ortiz Ordoñez
 */
public class CalendarioFechaHora {

    public static void main(String[] args) {
        
        Calendar calendario = Calendar.getInstance();
        
        int agnio = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int dia = calendario.get(Calendar.DATE);
        
        System.out.println("Día: " + dia);
        System.out.println("Mes: " + mes);
        System.out.println("Año: " + agnio);
        
        System.out.println();
        
        int hora = calendario.get(Calendar.HOUR);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);
        
        System.out.println("Hora: " + hora);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
