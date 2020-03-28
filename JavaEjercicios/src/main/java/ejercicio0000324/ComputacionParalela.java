package ejercicio0000324;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Ejercicio 324: Usar computación paralela para realizar un conteo de elementos en un arreglo.
 * 
 * @author John Ortiz Ordoñez
 */
public class ComputacionParalela {

    static final int TAMAGNIO = 10_000_000;
    
    public static void main(String[] args) {
        
        int[] numeros = crearArreglo();
        
        ContadorArreglo tareaPrincipal = new ContadorArreglo(numeros, 0, TAMAGNIO, 100_000);
        ForkJoinPool pool = new ForkJoinPool();
        Integer contadorNumerosImpares = pool.invoke(tareaPrincipal);
        
        System.out.printf("La cantidad de números impares es igual a " + contadorNumerosImpares);
    }

    private static int[] crearArreglo() {
        int[] numeros = new int[TAMAGNIO];
        int contador = 1;
        
        for (int i = 0; i < TAMAGNIO; i++) {
            numeros[i] = contador++;
        }
        
        return numeros;
    }
}

class ContadorArreglo extends RecursiveTask<Integer> {
    private int[] numeros;
    private int inicio;
    private int fin;
    private int umbral;

    public ContadorArreglo(int[] numeros, int inicio, int fin, int umbral) {
        this.numeros = numeros;
        this.inicio = inicio;
        this.fin = fin;
        this.umbral = umbral;
    }

    @Override
    protected Integer compute() {
        if (fin - inicio < umbral){
            return conteoNumerosImpares();
        } else {
            int mitad = (fin + inicio) / 2;
            
            ContadorArreglo tarea1 = new ContadorArreglo(numeros, inicio, mitad, umbral);
            ContadorArreglo tarea2 = new ContadorArreglo(numeros, mitad, fin, umbral);
            
            invokeAll(tarea1, tarea2);
            
            return tarea1.join() + tarea2.join();
        }
    }
    
    private Integer conteoNumerosImpares(){
        Integer contador = 0;
        
        for (int i = inicio; i < fin; i++) {
            if (numeros[i] % 2 == 1){
                ++contador;
            }
        }
        
        return contador;
    }
}
