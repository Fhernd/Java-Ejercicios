package ejercicio0000322;

/**
 * Ejercicio 322: Distribuir la carga de trabajo a través de múltiples threads de ejecución.
 * 
 * @author John Ortiz Ordoñez
 */
public class TrabajoDistribuido {
    
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        
        int contador = 1;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = contador++;
            }
        }
        
        SumaArreglo[] threads = new SumaArreglo[matriz.length];
        
        for (int i = 0; i < matriz.length; i++) {
            threads[i] = new SumaArreglo(matriz[i]);
        }
        
        for (SumaArreglo thread : threads) {
            thread.start();
        }
        
        try{
            for (SumaArreglo thread : threads) {
                thread.join();
            }
        } catch(InterruptedException e){
            System.err.println("Ha fallado la espera de ejecución de todos los threads.");
        }
        
        int total = 0;
        
        for (SumaArreglo thread : threads) {
            total += thread.getSuma();
        }
        
        System.out.println("La suma de todos los elementos de la matriz es " + total);
    }
}

class SumaArreglo extends Thread {
    
    private int[] numeros;
    private int suma;

    public SumaArreglo(int[] numeros) {
        this.numeros = numeros;
        suma = 0;
    }

    @Override
    public void run() {
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
    }

    public int getSuma() {
        return suma;
    }
}
