package ejercicio0000423;

import java.util.Calendar;

/**
 * Ejercicio 423: Efectuar operaciones aritméticas sobre fechas y horas con un
 * objeto Calendar.
 *
 * @author John Ortiz Ordoñez
 */
public class CalendarioAritmetica {

    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();
        
        System.out.println("Fecha y hora actual: " + calendario.getTime());
        
        System.out.println();
        
        calendario.add(Calendar.DATE, -23);
        System.out.println("Fecha y hora: " + calendario.getTime());
        
        calendario.add(Calendar.DATE, 70);
        System.out.println("Fecha y hora: " + calendario.getTime());
        
        System.out.println();
        
        calendario.add(Calendar.MONTH, 5);
        System.out.println("Fecha y hora: " + calendario.getTime());
        
        System.out.println();
        
        calendario.add(Calendar.YEAR, -36);
        System.out.println("Fecha y hora: " + calendario.getTime());
        
        
        calendario = Calendar.getInstance();
        
        calendario.add(Calendar.YEAR, 146);
        System.out.println("Fecha y hora: " + calendario.getTime());
    }
}
