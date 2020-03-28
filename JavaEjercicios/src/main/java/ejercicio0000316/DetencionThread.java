package ejercicio0000316;

/**
 * Ejercicio 316: Detener la ejecución de un thread por medio de una variable booleana.
 * 
 * @author John Ortiz Ordoñez
 */
public class DetencionThread extends Thread{
    protected volatile boolean terminado = false;

    @Override
    public void run() {
        while(!terminado){
            System.out.println("El thread está en ejecución...");
            
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        
        System.out.println("El threada ha terminado su ejecución.");
    }
    
    public void detener(){
        terminado = true;
    }
    
    public static void main(String[] args) throws InterruptedException {
        DetencionThread dt = new DetencionThread();
        dt.start();
        
        Thread.sleep(7000);
        
        dt.detener();
    }
}
