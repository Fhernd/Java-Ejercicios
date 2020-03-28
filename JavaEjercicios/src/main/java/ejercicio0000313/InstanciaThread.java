package ejercicio0000313;

/**
 * Ejercicio 313: Crear una instancia de Thread para ejecución de código en diferentes threads.
 *
 * @author John Ortiz Ordoñez
 */
public class InstanciaThread {

    private String mensaje;
    private int contador;

    public InstanciaThread(String mensaje, int contador) {
        this.mensaje = mensaje;
        this.contador = contador;

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (InstanciaThread.this.contador > 0) {
                    try {
                        System.out.println("MENSAJE: " + mensaje);

                        Thread.sleep(300);
                    } catch (InterruptedException ex) {
                        System.err.println("ERROR: " + ex.getMessage());
                    }

                    --InstanciaThread.this.contador;
                }
            }
        }).start();
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public static void main(String[] args) {
        new InstanciaThread("Thread No. 1", 15);
        new InstanciaThread("Thread No. 2", 20);
    }
}
