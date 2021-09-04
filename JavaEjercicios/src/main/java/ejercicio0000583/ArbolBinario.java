package ejercicio0000583;

/**
 * Ejercicio 583: Ajustar el método para insertar un nuevo elemento en un árbol binario.
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
        Nodo auxiliar = null;
        int valorActual = Integer.parseInt(String.valueOf(dato));
        
        while (temporal != null) {
            auxiliar = temporal;
            int valor = Integer.parseInt(String.valueOf(temporal.dato));
            
            if (valorActual < valor) {
                temporal = temporal.izquierda;
            } else {
                temporal = temporal.derecha;
            }
        }
        
        int valor = 0;
        
        if (auxiliar != null) {
            valor = Integer.parseInt(String.valueOf(auxiliar.dato));
        }
        
        if (auxiliar == null) {
            auxiliar = new Nodo<>(dato);
        } else if (valorActual < valor) {
            auxiliar.izquierda = new Nodo<>(dato);
        } else {
            auxiliar.derecha = new Nodo<>(dato);
        }
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
