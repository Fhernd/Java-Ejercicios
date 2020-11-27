package ejercicio0000442;

/**
 * 
 *
 * @author John Ortiz Ordoñez
 */
public class AplicacionEstadisticas {

    public static void main(String[] args) {
        Estadisticas estadisticas1 = Estadisticas.getInstance();
        
        double[] datos = {2, 3, 5, 7, 11, 13, 17, 19};
        
        System.out.println(estadisticas1.promedio(datos));
        System.out.println(estadisticas1.desviacionEstandar(datos));
        System.out.println(estadisticas1);
        
        System.out.println();
        
        Estadisticas estadisticas2 = Estadisticas.getInstance();
        System.out.println(estadisticas2.promedio(datos));
        System.out.println(estadisticas2.desviacionEstandar(datos));
        System.out.println(estadisticas2);
    }
}
