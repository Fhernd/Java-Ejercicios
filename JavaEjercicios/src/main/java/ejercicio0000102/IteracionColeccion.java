package ejercicio0000102;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Ejercicio 102: Iterar una colección.
 * 
 * @author John Ortiz Ordoñez
 */
public class IteracionColeccion {

    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        
        // Recorrido a través de ciclo for estándar:
        System.out.println("\nRecorrido con ciclo for estándar:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
        
        Iterator<Integer> iterador = numeros.iterator();
        System.out.println("\n\nRecorrido con iterador:");
        while(iterador.hasNext()){
            System.out.print(iterador.next() + " ");
        }
        
        System.out.println("\n\nRecorrido con ciclo for mejorado:");
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
        
        System.out.println("\n\nRecorrido con el método forEach:");
        numeros.forEach(numero -> System.out.print(numero + " "));
        
        System.out.println("\n\nRecorrido con el método forEach especificando una función nombrada:");
        numeros.forEach(System.out::print);
        System.out.println("");
        numeros.forEach(IteracionColeccion::imprimirNumero);
    }
    
    public static void imprimirNumero(Integer numero){
        System.out.print(numero + " ");
    }
}
