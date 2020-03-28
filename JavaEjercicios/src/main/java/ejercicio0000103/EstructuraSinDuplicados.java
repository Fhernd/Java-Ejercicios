package ejercicio0000103;

import java.util.Set;
import java.util.HashSet;

/**
 * Ejercicio 103: Usar una estructura de datos para evitar contenido 
 * duplicado.
 * 
 * @author John Ortiz Ordoñez
 */
public class EstructuraSinDuplicados {
    public static void main(String[] args) {
        
        Set<String> ides = new HashSet<>();
        
        ides.add("NetBeans");
        System.out.println(ides.size());
        ides.add("JetBrains IntelliJ");
        System.out.println(ides.size());
        ides.add("Eclipse");
        System.out.println(ides.size());
        ides.add("NetBeans");
        System.out.println(ides.size());
        
        if (ides.add("Eclipse")){
            System.out.println("Se agregó correctamente");
        } else {
            System.out.println("No se agregó correctamente. Ya existía en el conjunto.");
        }
    }
}
