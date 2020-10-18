package ejercicio0000409;

import java.time.LocalDate;

/**
 * Ejercicio 409: Usar el método static LocalDate.now() para obtener la fecha 
 * actual.
 *
 * @author John Ortiz Ordoñez
 */
public class FechaSinHora {

    public static void main(String[] args) {
        
        LocalDate fechaActual = LocalDate.now();
        
        System.out.println("Fecha actual: " + fechaActual);
    }
}
