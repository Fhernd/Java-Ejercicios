package ejercicio0000504;

/**
 * Ejercicio 504: Definir una función para calcular la distancia entre dos puntos de la superficie de la Tierra.
 *
 * @author John Ortiz Ordoñez
 */
public class DistanciaPuntosTierra {

    public static void main(String[] args) {
        
        // Pitalito (Huila - Colombia):
        double latitudPitalito = 1.85371;
        double longitudPitalito = -76.05071;
        
        // Moscú (Rusia)
        double latitudRusia = 55.47920;
        double longitudRusia = 37.32733;
        
        double distancia = calcularDistanciaPuntosSuperficieTierra(latitudPitalito, longitudPitalito, latitudRusia, longitudRusia);
        
        System.out.println(distancia);
    }
    
    public static double calcularDistanciaPuntosSuperficieTierra(double latitudPunto1, double longitudPunto1,
                                                                 double latitudPunto2, double longitudPunto2) {
        latitudPunto1 = Math.toRadians(latitudPunto1);
        longitudPunto1 = Math.toRadians(longitudPunto1);
        latitudPunto2 = Math.toRadians(latitudPunto2);
        longitudPunto2 = Math.toRadians(longitudPunto2);
        
        final double RADIO_TIERRA = 6371.01;    // Kilómetros
        
        double distancia = RADIO_TIERRA * Math.acos(Math.sin(latitudPunto1) * Math.sin(latitudPunto2)
                            + Math.cos(latitudPunto1) * Math.cos(latitudPunto2) * Math.cos(longitudPunto1 - longitudPunto2));
        
        return distancia;
    }
}
