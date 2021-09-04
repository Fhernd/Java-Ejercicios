package ejercicio0000581;

/**
 * Ejercicio 581: Crear una clase personalizada para representar un árbol binario.
 *
 * @author John Ortiz Ordoñez.
 */
public class ArbolBinario {

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
