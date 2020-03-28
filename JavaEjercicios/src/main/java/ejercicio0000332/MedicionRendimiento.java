package ejercicio0000332;

import java.lang.reflect.Method;

/**
 * Ejercicio 332: Crear una clase para medir el tiempo de ejecución de un proceso usando Reflection API.
 * 
 * @author John Ortiz Ordoñez
 */
public class MedicionRendimiento {

    public static void main(String[] args) throws Exception{
        Class<?> clase = Class.forName(args[0]);
        
        // Recuperación del método `main()` de la clase que se está cargando:
        Class<?>[] clases = {args.getClass()};
        Method main = clase.getMethod("main", clases);
        
        // Argumentos para el método `main()` recuperado:
        String[] argumentos = new String[args.length - 1];
        System.arraycopy(args, 1, argumentos, 0, argumentos.length);
        
        // Datos para la invocación `main()`:
        Object[] datosArgumentos = {argumentos};
        
        System.out.println("Inicio de la medición del tiempo de ejecución:");
        
        long inicio = System.currentTimeMillis();
        
        main.invoke(null, datosArgumentos);
        
        long fin = System.currentTimeMillis();
        
        long total = fin - inicio;
        
        System.out.println("Fin de la medición del tiempo de ejecución.");
        
        System.out.println("Total tiempo ejecución: " + total);
    }
}

// Modo de uso:

// java MedicicionRendimiento co.ortizol.EjecucionLineal 1000000 Abc
// java MedicicionRendimiento co.ortizol.EjecucionParalela 1000000 Abc
