package ejercicio0000368;

import java.util.List;

/**
 * Ejercicio 368: Crear una lista inmutable de cadenas con el método List.of().
 *
 * @author John Ortiz Ordoñez
 */
public class ListaInmutable {

    public static void main(String[] args) {

        List<String> planetas = List.of("Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno");
        System.out.println(planetas);

        try {
            planetas.add("Plutón");
        } catch (UnsupportedOperationException uoe) {
            System.out.println("Está operación no está permitida. La lista es inmutable.");
        }
    }
}
