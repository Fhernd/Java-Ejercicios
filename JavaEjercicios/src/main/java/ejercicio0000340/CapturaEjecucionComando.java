package ejercicio0000340;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ejercicio 340: Ejecutar un comando externo y capturar los datos que retorna.
 *
 * @author John Ortiz Ordoñez
 */
public class CapturaEjecucionComando {

    public static void main(String[] args) {
        try {
            final String COMANDO = "dir C:\\Windows";
            Process proceso = Runtime.getRuntime().exec(COMANDO);
            
            Thread thread = new Thread(() -> {
                try {
                    proceso.waitFor();
                } catch (InterruptedException e) {
                    return;
                }
                
                System.out.println("La ejecución de l comando ha terminado.");
            });
            
            thread.start();
            
            BufferedReader resultado = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            
            String linea;
            
            while((linea = resultado.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e) {

        }
    }
}
