package ejercicio0000174;

import java.io.File;

/**
 * Ejercicio 174: Mostrar las letras de unidades de disco en el sistema a 
 * través del método listRoots de la clase File.
 * 
 * @author John Ortiz Ordoñez
 */
public class ObtencionLetrasUnidadesWindows {

    public static void main(String[] args) {
        
        File[] unidades = File.listRoots();
        
        for (File unidad : unidades) {
            System.out.println(unidad);
        }
    }
}
