package ejercicio0000320;

import java.io.IOException;
import java.util.LinkedList;

/**
 * Ejercicio 320: Crear una implementación básica de productor/consumidor con wait() y notifyAll().
 * 
 * @author John Ortiz Ordoñez
 */
public class ProductorConsumidor {
    protected LinkedList<Object> lista = new LinkedList<>();
    
    protected void producir(){
        int cantidadElementos = 0;
        
        synchronized(lista){
            Object nuevoElemento = new Object();
            lista.addFirst(nuevoElemento);
            cantidadElementos = lista.size();
            
            lista.notifyAll();
        }
        
        System.out.println("Cantidad de elementos después de la producción: " + cantidadElementos);
    }
    
    protected void consumir(){
        Object elemento = null;
        int cantidadElementos = 0;
        
        synchronized(lista){
            while(lista.size() == 0){
                try {
                    lista.wait();
                } catch (InterruptedException e) {
                    return;
                }
            }
            
            elemento = lista.removeLast();
            cantidadElementos = lista.size();
        }
        
        System.out.println("Elemento extraído de la lista: " + elemento);
        System.out.println("Cantidad de elementos después del consumo: " + cantidadElementos);
    }
    
    public static void main(String[] args) throws IOException{
        ProductorConsumidor pc = new ProductorConsumidor();
        System.out.println("Presione p para producir o c para consumir:");
        int codigoCaracter;
        
        while((codigoCaracter = System.in.read()) != -1){
            char caracter = (char) codigoCaracter;
            
            switch(caracter){
                case 'p':
                    pc.producir();
                    break;
                case 'c':
                    pc.consumir();
            }
        }
    }
}
