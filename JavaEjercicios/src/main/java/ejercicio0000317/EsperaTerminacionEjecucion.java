package ejercicio0000317;

import java.io.IOException;

/**
 * Ejercicio 317: Esperar con el método join() a la terminación de la ejecución de un thread.
 * 
 * @author John Ortiz Ordoñez
 */
public class EsperaTerminacionEjecucion {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Inicio de la captura de datos."); 
            
            try {
                System.in.read();
            } catch (IOException e) {
            }
            
            System.out.println("Fin de la captura de datos.");
        });
        
        System.out.println("Inicio de la aplicación.");
        t.start();
        
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Se ha producido un error al intentar esperar por la terminación del thread.");
        }
        
        System.out.println("Fin de la aplicación.");
    }
}
