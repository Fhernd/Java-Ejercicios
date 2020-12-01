package ejercicio0000443;

/**
 * Ejercicio 443: Implementar el patrón singleton usando una enumeración.
 *
 * @author John Ortiz Ordoñez
 */
public class Aplicacion {
    public static void main(String[] args) {
        
        EstadisticasSingleton singleton = EstadisticasSingleton.INSTANCE;
        
        double[] datos = {2, 3, 5, 7, 11, 13, 17, 19};
        
        double resultado = singleton.promedio(datos);
        System.out.println(resultado);
        
        System.out.println();
        
        resultado = singleton.desviacionEstandar(datos);
        System.out.println(resultado);
    }
}
