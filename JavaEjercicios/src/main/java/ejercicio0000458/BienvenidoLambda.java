package ejercicio0000458;

/**
 * Ejercicio 458: Crear un ejemplo básico de una expresión lambda.
 *
 * @author John Ortiz Ordoñez
 */
public class BienvenidoLambda {

    public static void main(String[] args) {
        
        Hola holaLambda = (String mensaje) -> {
            System.out.printf("Hola, %s\n", mensaje);
        };
        
        holaLambda.saludar("expresión lambda!");
    }
}

/**
 * Interfaz funcional.
 * @author John Ortiz Ordoñez.
 */
interface Hola {
    /**
     * Saluda a partir de un mensaje.
     * @param mensaje Mensaje de saludo.
     */
    void saludar(String mensaje);
}
