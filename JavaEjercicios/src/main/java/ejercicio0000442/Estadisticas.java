package ejercicio0000442;

import java.io.Serializable;

/**
 * Ejercicio 442: Aplicar el patrón singleton para operaciones estadísticas.
 *
 * @author John Ortiz Ordoñez
 */
public class Estadisticas implements Serializable{

    private static volatile Estadisticas instance = new Estadisticas();
    
    private Estadisticas() {
        
    }
    
    public static Estadisticas getInstance() {
        return instance;
    }
    
    public double promedio(double datos[]) {
        double suma = 0;
        
        for (double dato : datos) {
            suma += dato;
        }
        
        return suma / datos.length;
    }
    
    public double desviacionEstandar(double datos[]) {
        double promedio = promedio(datos);
        double suma = 0;
        
        for (double dato : datos) {
            suma += Math.pow(dato - promedio, 2);
        }
        
        return Math.sqrt(suma / datos.length);
    }
}
