package ejercicio0000175;

import java.io.File;

/**
 * Ejercicio 175: Crear nuevos directorios con los métodos mkdir y mkdirs.
 * 
 * @author John Ortiz Ordoñez
 */
public class NuevosDirectorios {

    public static void main(String[] args) {
        
        String nuevoDirectorio = "etc";
        
        if (new File(nuevoDirectorio).mkdir()){
            System.out.println("Se creó el directorio " + nuevoDirectorio);
        }
        
        String nuevosDirectorios = "extra/libs/java";
        
        if (new File(nuevosDirectorios).mkdirs()){
            System.out.println("Se crearon los directorios " + nuevosDirectorios);
        }
    }
}
