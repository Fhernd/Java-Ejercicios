package ejercicio0000039;

import java.io.File;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class CaracterSeparacion {
    public static void main(String[] args){
        String caracterSeparacionNombreArchivo = File.separator;
        System.out.println(caracterSeparacionNombreArchivo);
        
        String caracterSeparacionRutas = File.pathSeparator;
        System.out.println(caracterSeparacionRutas);
    }
}
