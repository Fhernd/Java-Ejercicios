package ejercicio0000508;

import java.nio.charset.Charset;

/**
 * Ejercicio 508: Mostrar el listado de todos los juegos de caracteres disponibles en el sistema.
 *
 * @author John Ortiz Ordoñez
 */
public class JuegoCaracteresDisponibles {

    public static void main(String[] args) {
        
        for(String juegoCaracteres : Charset.availableCharsets().keySet()) {
            System.out.println(juegoCaracteres);
        }
    }
}
