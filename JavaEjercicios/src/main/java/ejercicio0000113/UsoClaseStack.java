package ejercicio0000113;

import java.util.Stack;

/**
 * Ejercicio 113: Uso de la clase Stack.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoClaseStack {

    public static void main(String[] args) {
        
        Stack<String> escritores = new Stack<>();
        
        escritores.add("Balzac");
        escritores.add("Dickens");
        escritores.add("Vallejo");
        escritores.add("Dostoievskiy");
        
        System.out.println("Cantidad elementos: " + escritores.size());
        
        System.out.println("Valor último elemento: " + escritores.peek());
        
        System.out.println("Cantidad elementos: " + escritores.size());
        
        System.out.println("Valor elemento en el tope de la pila: " + escritores.pop());
        
        System.out.println("Cantidad elementos: " + escritores.size());
        
        System.out.println("\nPosición de Balzac: " + escritores.search("Balzac"));
        
        escritores.pop();
        escritores.pop();
        escritores.pop();
        
        System.out.println("\n¿La pila está vacía?: " + escritores.empty());
    }
}
