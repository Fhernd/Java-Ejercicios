package ejercicio0000325;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * Ejercicio 325: Medir el desempeño de ejecución lineal vs ejecución paralela del Ejercicio 323.
 * 
 * @author John Ortiz Ordoñez
 */
public class PerformanceComputacionParalela {

    static final int TAMAGNIO = 1_000_000_000;
    
    public static void main(String[] args) {
        int[] numeros = cargarArreglo();
        
        ejecucionLineal(numeros);
        // Resultado: 7, 38, 356
        
        ejecucionParalela(numeros);
        // Resultado: 26, 654, 179
    }
    
    public static void ejecucionParalela(int[] numeros){
        long tiempoInicio = System.currentTimeMillis();
        
        TransformacionArreglo tareaPrincipal = new TransformacionArreglo(numeros, 10, 0, TAMAGNIO);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(tareaPrincipal);
        
        long tiempoFin = System.currentTimeMillis();
        
        long tiempo = tiempoFin - tiempoInicio;
        
        System.out.println("Tiempo total de ejecución paralela: " + tiempo);
    }
    
    public static void ejecucionLineal(int[] numeros){
        long tiempoInicio = System.currentTimeMillis();
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 10;
        }
        
        long tiempoFin = System.currentTimeMillis();
        
        long tiempo = tiempoFin - tiempoInicio;
        
        System.out.println("Tiempo total de ejecución lineal: " + tiempo);
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
