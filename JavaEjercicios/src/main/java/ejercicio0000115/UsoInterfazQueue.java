package ejercicio0000115;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Ejercicio 115: Uso de la interfaz Queue.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoInterfazQueue {

    public static void main(String[] args) {
        
        Queue<String> escritores = new LinkedList<>();
        
        escritores.add("Balzac");
        escritores.add("Vallejo");
        escritores.add("Llosa");
        escritores.add("Dostoievsky");
        escritores.add("Dickens");
        
        System.out.println("Tamaño cola: " + escritores.size());
        System.out.println("Primer elemento: " + escritores.peek());
        
        String balzac = escritores.remove();
        
        System.out.println("Primer elemento extraído: " + balzac);
        System.out.println("Tamaño cola: " + escritores.size());
        
        Iterator<String> elementos = escritores.iterator();
        
        System.out.println("\nIteración de la cola: ");
        while(elementos.hasNext()){
            System.out.println("Elemento actual: " + elementos.next());
        }
    }
}
