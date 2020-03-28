package ejercicio0000311;

/**
 * Ejercicio 311: Ejecutar un código en threads diferentes.
 * 
 * @author John Ortiz Ordoñez
 */
public class MultiplesThreads extends Thread {

    private String mensaje;
    private int contador;

    public MultiplesThreads(String mensaje, int contador) {
        this.mensaje = mensaje;
        this.contador = contador;
    }

    @Override
    public void run() {
        while(contador > 0){
            try {
                System.out.println("MENSAJE: " + mensaje);
                
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                System.err.println("ERROR: " + ex.getMessage());
            }
            
            --contador;
        }
    }
    
    public static void main(String[] args) {
        new MultiplesThreads("Thread No. 1", 15).start();
        new MultiplesThreads("Thread No. 2", 20).start();
    }
}
