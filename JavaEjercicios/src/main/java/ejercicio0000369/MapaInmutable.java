package ejercicio0000369;

import java.util.Map;

/**
 * Ejercicio 369: Crear un objeto Map inmutable con la método static Map.of().
 *
 * @author John Ortiz Ordoñez
 */
public class MapaInmutable {

    public static void main(String[] args) {
        
        Map<String, String> latinoamerica = Map.of("Colombia", "Bogotá", "Perú", "Lima", "Argentina", "Buenos Aires", "Ecuador", "Quito", "Bolivia", "La Paz");
        
        System.out.println(latinoamerica);
        
        try {
        latinoamerica.put("Venezuela", "Caracas");
        } catch(UnsupportedOperationException e) {
            System.out.println("MENSAJE: Un objeto Map inmutable no tiene disponible la función put()");
        }
    }
}
