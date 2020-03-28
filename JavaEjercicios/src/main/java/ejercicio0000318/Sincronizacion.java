package ejercicio0000318;

/**
 * Ejercicio 318: Sincronizar la ejecución de múltiples threads con synchronized.
 * 
 * @author John Ortiz Ordoñez
 */
public class Sincronizacion extends Thread{

    private String mensaje;
    private Emisor emisor;

    public Sincronizacion(String mensaje, Emisor emisor) {
        this.mensaje = mensaje;
        this.emisor = emisor;
    }
    
    @Override
    public void run() {
        synchronized(emisor){
            emisor.enviar(mensaje);
        }
    }
    
    public static void main(String[] args) {
        Emisor emisor = new Emisor();
        
        Sincronizacion saludo1 = new Sincronizacion("Hola ", emisor);
        Sincronizacion saludo2 = new Sincronizacion("Adiós ", emisor);
        
        saludo1.start();
        saludo2.start();
        
        try {
            saludo1.join();
            saludo2.join();
        } catch (InterruptedException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}

class Emisor{
    public void enviar(String mensaje){
        System.out.println("Enviando: " + mensaje);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
        System.out.println("El mensaje se ha enviado.");
    }
}
