package ejercicio0000582;

/**
 * Ejercicio 582: Definir el método para insertar un nuevo elemento en un árbol binario
 *
 * @author John Ortiz Ordoñez.
 */
public class ArbolBinario<T> {
    Nodo<T> root;
    
    public ArbolBinario() {
        root = null;
    }
    
    public void insertar(T dato) {
        if (root == null) {
            root = new Nodo<>(dato);
            return;
        }
        
        Nodo temporal = root;
        int valorActual = Integer.parseInt(String.valueOf(dato));
        
        while (temporal != null) {
            int valor = Integer.parseInt(String.valueOf(temporal.izquierda.dato));
            
            if (valor < valorActual) {
                temporal = temporal.izquierda;
            } else if (valor > valorActual) {
                temporal = temporal.derecha;
            }
        }
        
        temporal = new Nodo<>(valorActual);
    }
}

class Nodo<T> {

    public T dato;
    public Nodo<T> izquierda;
    public Nodo<T> derecha;

    public Nodo(T dato) {
        this.dato = dato;
        izquierda = null;
        derecha = null;
    }
}
