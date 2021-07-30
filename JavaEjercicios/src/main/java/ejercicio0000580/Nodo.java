package ejercicio0000580;

/**
 * Ejercicio 580: Crear una clase personalizada para representar un nodo de una estructura tipo árbol.
 *
 * @author John Ortiz Ordoñez.
 * @param <T>: Tipo paramétrico del dato a almacenar.
 */
public class Nodo<T> {

    public T dato;
    public Nodo<T> izquierda;
    public Nodo<T> derecha;

    public Nodo(T dato) {
        this.dato = dato;
        izquierda = null;
        derecha = null;
    }
}
