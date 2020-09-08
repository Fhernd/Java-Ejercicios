package ejercicio0000361;

import java.time.Duration;
import java.util.Optional;

/**
 * Ejercicio 361: Obtener y mostrar la información de los procesos del sistema 
 * operativo.
 *
 * @author John Ortiz Ordoñez
 */
public class ListadoProcesos {
    public static void main(String[] args) {
        
        ProcessHandle.allProcesses()
                .forEach(System.out::println);
        
        System.out.println();
        
        mostrarDetallesProcesos();
    }
    
    public static void mostrarDetallesProcesos() {
        ProcessHandle.allProcesses()
                .forEach(p -> System.out.println(formatearProceso(p)));
    }
    
    public static String formatearProceso(ProcessHandle proceso) {
        long idProceso = proceso.pid();
        boolean enEjecucioin = proceso.isAlive();
        Optional<Duration> duracion = proceso.info().totalCpuDuration();
        Optional<String> nombre = proceso.info().command();
        
        return String.format("PID: %d - ¿En ejecución?: %s - Duración: %s - Nombre: %s", idProceso, enEjecucioin, duracion, nombre);
    }
}
