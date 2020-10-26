package ejercicio0000414;

import java.time.Month;
import java.time.MonthDay;

/**
 * Ejercicio 414: Usar el método static now() para obtener el número de día 
 * de un mes.
 *
 * @author John Ortiz Ordoñez
 */
public class ObtencionDiaMes {

    public static void main(String[] args) {
        
        MonthDay mesDiaActual = MonthDay.now();
        System.out.println("Mes y día actual: " + mesDiaActual);
        
        System.out.println();
        
        MonthDay mesDia = MonthDay.of(Month.MAY, 7);
        System.out.println(mesDia);
    }
}
