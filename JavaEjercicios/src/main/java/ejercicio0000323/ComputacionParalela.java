package ejercicio0000323;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * Ejercicio 323: Computación paralela para distribuir la carga de trabajo en múltiples threads.
 * 
 * @author John Ortiz Ordoñez
 */
public class ComputacionParalela {

    static final int TAMAGNIO = 10_000_000;
    
    public static void main(String[] args) {
        int[] numeros = cargarArreglo();
        
        System.out.println("Contenido del arreglo antes de la transformación:");
        imprimirArreglo(numeros, 100);
        
        TransformacionArreglo tareaPrincipal = new TransformacionArreglo(numeros, 10, 0, TAMAGNIO);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(tareaPrincipal);
        
        System.out.println();
        
        System.out.println("Contenido del arreglo después de la transformación:");
        imprimirArreglo(numeros, 100);
    }

    private static int[] cargarArreglo() {
        int[] numeros = new int[TAMAGNIO];
        int contador = 1;
        
        for (int i = 0; i < TAMAGNIO; i++) {
            numeros[i] = contador++;
        }
        
        return numeros;
    }

    private static void imprimirArreglo(int[] numeros, int cantidadElementos) {
        for (int i = 0; i < cantidadElementos; i++) {
            System.out.println(numeros[i] + " ");
        }
    }
}

class TransformacionArreglo extends RecursiveAction{

    private int[] numeros;
    private int numero;
    private int inicio;
    private int fin;
    private int threshold = 100_000;

    public TransformacionArreglo(int[] numeros, int numero, int inicio, int fin) {
        this.numeros = numeros;
        this.numero = numero;
        this.inicio = inicio;
        this.fin = fin;
    }
    
    @Override
    protected void compute() {
        if (fin - inicio < threshold){
            multiplicarElementos();
        } else {
            int mitad = (inicio + fin) / 2;
            
            TransformacionArreglo parte1 = new TransformacionArreglo(numeros, numero, inicio, mitad);
            TransformacionArreglo parte2 = new TransformacionArreglo(numeros, numero, mitad, fin);
            
            invokeAll(parte1, parte2);
        }
    }

    private void multiplicarElementos() {
        for (int i = inicio; i < fin; i++) {
            numeros[i] *= numero;
        }
    }
    
}
