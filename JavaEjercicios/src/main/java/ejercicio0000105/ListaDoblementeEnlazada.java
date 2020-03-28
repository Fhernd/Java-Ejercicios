package ejercicio0000105;

import java.util.LinkedList;

/**
 * Ejercicio 105: Usar la clase LinkedList como lista doblemente enlazada.
 * 
 * @author John Ortiz Ordoñez
 */
public class ListaDoblementeEnlazada {
    
    public static void main(String[] args) {
        
        LinkedList<String> lista = new LinkedList<>();
        
        lista.add("NetBeans");
        lista.add("Eclipse");
        lista.add("IntelliJ");
        lista.add("BlueJ");
        
        System.out.println("Primera iteración:");
        for (String programa : lista) {
            System.out.print(programa + " ");
        }
        
        lista.add(1, "Visual Studio Code");
        
        System.out.println("\n\nSegunda iteración:");
        for (String programa : lista) {
            System.out.print(programa + " ");
        }
        
        String visualStudioCode = lista.get(1);
        System.out.println("\n\nSegundo programa: " + visualStudioCode);
        
        String primerElemento = lista.getFirst();
        System.out.println("\n\nPrimer elemento: " + primerElemento);
        String ultimoElemento = lista.getLast();
        System.out.println("\n\nÚltimo elemento: " + ultimoElemento);
        
        //poll:
        primerElemento = lista.poll();
        System.out.println("\nPrimer elemento (cabeza: " + primerElemento);
        
        System.out.println("\n\nTercera iteración:");
        for (String programa : lista) {
            System.out.print(programa + " ");
        }
        
        lista.pollFirst();
        lista.pollLast();
        
        System.out.println("\n\nCuarta iteración:");
        for (String programa : lista) {
            System.out.print(programa + " ");
        }
    }
}
