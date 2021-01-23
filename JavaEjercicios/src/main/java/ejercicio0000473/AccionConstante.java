package ejercicio0000473;

/**
 * Ejercicio 473: Realizar una acción específica acorde al valor de una constante 
 * de una enumeración.
 * 
 * @author John Ortiz Ordoñez
 */
public class AccionConstante {

    public static void main(String[] args) {
        
        NivelRiesgo nivel = NivelRiesgo.BAJO;
        
        mostrarMensaje(nivel);
        
        System.out.println();
        
        nivel = NivelRiesgo.MEDIO;
        mostrarMensaje(nivel);
        
        System.out.println();
        
        nivel = NivelRiesgo.ALTO;
        mostrarMensaje(nivel);
    }
    
    public static void mostrarMensaje(NivelRiesgo nivel) {
        switch(nivel) {
            case BAJO:
                System.out.println("Tenga cuidado. Hay riesgo de contaminación.");
                break;
            case MEDIO:
                System.out.println("Lugar de desechos tóxicos. Use el equipo de protección adecuado.");
                break;
            case ALTO:
                System.out.println("¡Peligro! Nivel de riesgo alto. Peligro de muerte.");
                break;
        }
    }
}

enum NivelRiesgo {
    BAJO,
    MEDIO,
    ALTO
}
