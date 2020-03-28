package ejercicio0000101;

/**
 * Ejercicio 101: Creación de una clase de colección genérica.
 * 
 * @author John Ortiz Ordoñez
 */
public class Pila<T> {
    
    public final static int TAMAÑO_INICIAL = 10;
    private T[] elementos;
    int contador;

    public Pila() {
        this(TAMAÑO_INICIAL);
    }
    
    public Pila(int tamaño){
        if (tamaño > 0){
            elementos = (T[]) new Object[tamaño];
        } else {
            elementos = (T[]) new Object[TAMAÑO_INICIAL];
        }
        contador = 0;
    }    
    
    public boolean estaVacia(){
        return contador == 0;
    }
    
    public void insertar(T elemento){
        elementos[contador] = elemento;
        ++contador;
    }
    
    public T sacar(){
        if (contador == 0){
            return null;
        } else {
            return elementos[contador--];
        }
    }
    
    public static void main(String[] args) {
        Pila<Integer> numeros = new Pila<>();
        
        numeros.insertar(1);
        numeros.insertar(2);
        numeros.insertar(3);
        numeros.insertar(4);
        numeros.insertar(5);
        
        numeros.sacar();
        numeros.sacar();
        numeros.sacar();
        numeros.sacar();
        numeros.sacar();
        System.out.println(numeros.sacar());
    }
}
