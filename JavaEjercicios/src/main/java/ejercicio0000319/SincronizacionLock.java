package ejercicio0000319;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Ejercicio 319: Adaptar la solución del Ejercicio 318 con el uso del mecanismo Lock.
 * 
 * @author John Ortiz Ordoñez
 */
public class SincronizacionLock {
    public static void main(String[] args) {
        Emisor emisor = new Emisor();
        
        Lock lock = new ReentrantLock();
        
        Sincronizacion saludo1 = new Sincronizacion("Hola ", emisor, lock);
        Sincronizacion saludo2 = new Sincronizacion("Adiós ", emisor, lock);
        
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

class Sincronizacion extends Thread{

    private String mensaje;
    private Emisor emisor;
    private Lock lock;

    public Sincronizacion(String mensaje, Emisor emisor, Lock lock) {
        this.mensaje = mensaje;
        this.emisor = emisor;
        this.lock = lock;
    }
    
    @Override
    public void run() {
        lock.lock();
        
        emisor.enviar(mensaje);
        
        lock.unlock();
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
