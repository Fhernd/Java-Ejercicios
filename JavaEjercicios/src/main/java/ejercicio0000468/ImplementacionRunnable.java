package ejercicio0000468;

/**
 * Ejercicio 468: Implementar la interfaz Runnable utilizando una expresión lambda.
 *
 * @author John Ortiz Ordoñez
 */
public class ImplementacionRunnable {

    public static void main(String[] args) {

        Runnable procesoSegundoPlano1 = new Runnable() {
            @Override
            public void run() {
                int a = 2;
                int b = 3;
                int suma = a + b;

                System.out.println("La suma total es: " + suma);
            }
        };

        Runnable procesoSegundoPlano2 = () -> {
            int a = 5;
            int b = 2;
            int suma = a + b;

            System.out.println("La suma total es: " + suma);
        };

        procesoSegundoPlano1.run();
        procesoSegundoPlano2.run();
    }
}
