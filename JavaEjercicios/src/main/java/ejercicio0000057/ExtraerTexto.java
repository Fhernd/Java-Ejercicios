package ejercicio0000057;

import java.util.regex.Pattern;

/**
 * Ejercicio 57: Indicar si un objeto String contiene un patrón.
 * 
 * @author John Ortiz Ordoñez
 */
public class ExtraerTexto {
    public static void main(String[] args){
        String[] cadenas = {
            "C111. Abordaje 20:30",
            "Cu12. Código Monitor",
            "C123. Atterizaje 08:09",
            "C842. Abordaje 23:30",
            "CA12. Código Mouse"
        };
        
        String cadenaPatron = "^C[0-9]{3}";
        
        Pattern patron = Pattern.compile(cadenaPatron);
        
        for (String cadena : cadenas) {
            if (patron.matcher(cadena).lookingAt()){
                System.out.println("Cumple con el patrón del código.");
            } else {
                System.out.println("NO cumple con el patrón del código.");
            }
        }
    }
}
