package ejercicio0000104;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Ejercicio 104: Acceder a los datos de una estructura de forma 
 * independiente.
 * 
 * @author John Ortiz Ordoñez
 */
public class EnumeracionEstructuras {
    public static void main(String[] args) {
        
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Sonia");
        nombres.add("Edward");
        nombres.add("Daniela");
        nombres.add("Oliva");
        
        Set<String> programas = new HashSet<>();
        programas.add("NetBeans");
        programas.add("Notepad++");
        programas.add("Eclipse");
        
        TreeSet<String> ciudades = new TreeSet<>();
        ciudades.add("Bogotá");
        ciudades.add("Medellín");
        ciudades.add("Neiva");
        
        System.out.println("Iteración ArrayList:");
        iterarContenido(nombres.iterator());
        System.out.println("\n\nIteración Set:");
        iterarContenido(programas.iterator());
        System.out.println("\n\nIteración TreeSet:");
        iterarContenido(ciudades.iterator());
    }
    
    public static void iterarContenido(Iterator<String> iterador){
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
    }
}
