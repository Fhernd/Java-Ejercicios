package ejercicio0000587;

/**
 * Ejercicio 587: Crear la implementación del modo de recorrido inorden en un árbol binario.
 *
 * @author John Ortiz Ordoñez.
 * @param <T> Tipo paramétrico.
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
    
    public void inorden(Nodo<T> nodo) {
        if (nodo == null) {
            return;
        }
        
        inorden(nodo.izquierda);
        
        System.out.print(nodo.dato + " ");
        
        inorden(nodo.derecha);
    }
    
    public static void main(String[] args) {
        ArbolBinario<Integer> arbolEnteros = new ArbolBinario<>();
        arbolEnteros.insertar(7);
        arbolEnteros.insertar(13);
        arbolEnteros.insertar(11);
        arbolEnteros.insertar(3);
        arbolEnteros.insertar(5);
        arbolEnteros.insertar(2);
        arbolEnteros.insertar(17);
        
        arbolEnteros.inorden(arbolEnteros.root);
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
