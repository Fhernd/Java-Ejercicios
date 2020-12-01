package ejercicio0000443;

/**
 *
 * @author John Ortiz Ordoñez.
 */
public enum EstadisticasSingleton {
    INSTANCE;
    
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
